package com.example.demo.domain.auth.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class RefreshTokenRequest {
    @NotBlank(message = "refrehToken이 null이면 안됨")
    String refreshToken;
}
