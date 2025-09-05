package com.banking.account.controller;

import com.banking.common.dto.ApiResponse;
import com.banking.common.util.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts/health")
    public ApiResponse<String> healthCheck() {
        return new ApiResponse<>(
                true,
                Constants.SUCCESS,
                "Account Service is UP 🚀"
        );
    }
}
