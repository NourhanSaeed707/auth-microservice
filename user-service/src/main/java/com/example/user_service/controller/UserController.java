package com.example.user_service.controller;
import com.example.user_service.model.Users;
import com.example.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<Users> getAll() {
        return userService.getAll();
    }

    @GetMapping("/get-by-email/{email}")
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public Users getUserByEmail(@PathVariable("email") String email) {
        return userService.getUserByEmail(email);
    }
}
