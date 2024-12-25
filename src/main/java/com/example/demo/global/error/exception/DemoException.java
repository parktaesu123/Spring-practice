package com.example.demo.global.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DemoException extends RuntimeException{
    private final ErrorCode errorCode;
}
