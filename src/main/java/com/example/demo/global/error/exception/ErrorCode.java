package com.example.demo.global.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    //jwt
    EXPIRED_TOKEN(401, "만료된 토큰입니다."),
    INVALID_TOKEN(401, "검증 되지 않은 토큰 입니다."),
    REFRESH_TOKEN_NOT_FOUND(404, "일치 하는 RefreshToken이 존재 하지 않습니다."),
    INVALID_ROLE(401,"유효 하지 않은 역할입니다."),

    //user
    ACCOUNT_ID_EXIST(409,"이미 존재 하는 id입니다."),
    USER_NOT_FOUND(404, "해당 유저가 존재 하지 않습니다."),
    USER_MISMATCH(401, "유저가 일치 하지 않습니다."),
    PASSWORD_MISMATCH(401, "비밀 번호가 일치 하지 않습니다."),
    INVALID_USER(401, "유효 하지 않은 사용자입니다."),
    USER_EXIST(401, "유저가 이미 존재합니다."),

    // general
    BAD_REQUEST(400, "프론트 펑"),
    INTERNAL_SERVER_ERROR(500, "서버 펑");

    private final int statusCode;
    private final String ErrorMessage;
}