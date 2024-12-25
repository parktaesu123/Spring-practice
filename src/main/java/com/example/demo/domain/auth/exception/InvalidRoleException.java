package com.example.demo.domain.auth.exception;

import com.example.demo.global.error.exception.DemoException;
import com.example.demo.global.error.exception.ErrorCode;

public class InvalidRoleException extends DemoException {
    public static final DemoException EXCEPTION = new InvalidRoleException();

    public InvalidRoleException() {
        super(ErrorCode.INVALID_ROLE);
    }
}
