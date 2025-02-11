package com.example.gateway_service.filter;
import com.example.gateway_service.util.JwtUtil;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import java.util.List;
import java.util.function.Predicate;

@Component
public class JwtAuthenticationFilter implements GatewayFilter {
    private final JwtUtil jwtUtil;

    public JwtAuthenticationFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        System.out.println("reeeequesst: " + request);
        final List<String> apiEndpoints = List.of("/api/v1/auth/login", "/api/v1/auth/register", "/eureka");
        Predicate<ServerHttpRequest> isApiSecured = r -> apiEndpoints.stream()
                .noneMatch(uri -> r.getURI().getPath().contains(uri));
        System.out.println("is apiiiii secureeeed: " + isApiSecured);

        if (isApiSecured.test(request)) {
            System.out.println("insiiiide if condition: " + request);
            if (authMissing(request)) return onError(exchange);

            String token = request.getHeaders().getOrEmpty("Authorization").get(0);
            System.out.println("tooooooooookeen: " + token);

            if (token != null && token.startsWith("Bearer ")) token = token.substring(7);

            try {
                System.out.println("insiiiiiiiiiiiide tryyyyyyyy");
                jwtUtil.validateToken(token);
            } catch (Exception e) {
                return onError(exchange);
            }
        }
        System.out.println("beeeofore exchange");
        return chain.filter(exchange);
    }

    private Mono<Void> onError(ServerWebExchange exchange) {
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(HttpStatus.UNAUTHORIZED);
        return response.setComplete();
    }

    private boolean authMissing(ServerHttpRequest request) {
        System.out.println("keeeeeeeeey header auth: " + request.getHeaders().containsKey("Authorization"));
        return !request.getHeaders().containsKey("Authorization");
    }
}
