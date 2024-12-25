package com.example.demo.domain.auth.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;


@Builder
@Getter
public class TokenResponse {
    private String accessToken;
    private String refreshToken;
    private Date accessExpiredAt;
    private Date refreshExpiredAt;

    public TokenResponse(String accessToken, String refreshToken, Date accessExpiredAt, Date refreshExpiredAt) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.accessExpiredAt = accessExpiredAt;
        this.refreshExpiredAt = refreshExpiredAt;
    }
}
