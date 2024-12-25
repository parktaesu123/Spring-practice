package com.example.demo.domain.user.exception;

import com.example.demo.global.error.exception.DemoException;
import com.example.demo.global.error.exception.ErrorCode;

public class UserNotFoundException extends DemoException {
    public static final DemoException EXCEPTION = new UserNotFoundException();

    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
