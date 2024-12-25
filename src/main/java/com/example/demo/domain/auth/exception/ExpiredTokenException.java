package com.example.demo.domain.auth.exception;

import com.example.demo.global.error.exception.DemoException;
import com.example.demo.global.error.exception.ErrorCode;

public class ExpiredTokenException extends DemoException {
    public static final DemoException EXCEPTION = new ExpiredTokenException();

    public ExpiredTokenException() {
        super(ErrorCode.EXPIRED_TOKEN);
    }
}
