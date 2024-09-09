package com.example.auth.services;

import com.example.auth.models.requests.SignInRequest;
import com.example.auth.models.requests.SignUpRequest;
import com.example.auth.models.responses.AuthenticationResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface IAuthService {

    AuthenticationResponse signIn(SignInRequest request);

    AuthenticationResponse signUp(SignUpRequest request);

    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
