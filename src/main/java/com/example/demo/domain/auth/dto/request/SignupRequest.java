package com.example.demo.domain.auth.dto.request;

import com.example.demo.domain.user.domain.enums.Role;
import lombok.Getter;

@Getter
public class SignupRequest {
    private String userName;

    private String accountId;

    private String password;

    private String introduction;

    private Role role;
}
