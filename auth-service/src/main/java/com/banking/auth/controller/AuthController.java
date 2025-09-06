package com.banking.auth.controller;

import com.banking.common.dto.ApiResponse;
import com.banking.common.util.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/auth/health")
    public ApiResponse<String> healthCheck() {
        return new ApiResponse<>(
                true,
                Constants.SUCCESS,
                "Auth Service is UP 🔑"
        );
    }
}
