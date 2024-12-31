package com.example.demo.domain.auth.api;

import com.example.demo.domain.auth.application.LoginService;
import com.example.demo.domain.auth.application.ReissueService;
import com.example.demo.domain.auth.application.SignupService;
import com.example.demo.domain.auth.dto.request.LoginRequest;
import com.example.demo.domain.auth.dto.request.RefreshTokenRequest;
import com.example.demo.domain.auth.dto.request.SignupRequest;
import com.example.demo.domain.auth.dto.response.TokenResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final SignupService signupService;
    private final LoginService loginService;
    private final ReissueService reissueService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("signup")
    public void signup(@RequestBody @Valid SignupRequest request) {
        signupService.signup(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/login")
    public TokenResponse login(@RequestBody @Valid LoginRequest request) {
        return loginService.login(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/reissue")
    public TokenResponse reissue(@RequestBody @Valid RefreshTokenRequest request) {
        return reissueService.reissue(request);
    }
}
