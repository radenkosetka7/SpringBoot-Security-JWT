package com.example.auth.services;

import com.example.auth.models.requests.ChangePasswordRequest;

import java.security.Principal;

public interface IUserService {

    void changePassword(ChangePasswordRequest request, Principal principal);
}
