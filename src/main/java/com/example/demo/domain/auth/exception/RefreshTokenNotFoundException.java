package com.example.demo.domain.auth.exception;

import com.example.demo.global.error.exception.DemoException;
import com.example.demo.global.error.exception.ErrorCode;

public class RefreshTokenNotFoundException extends DemoException {
    public static final DemoException EXCEPTION = new RefreshTokenNotFoundException();

    public RefreshTokenNotFoundException() {
        super(ErrorCode.REFRESH_TOKEN_NOT_FOUND);
    }
}
