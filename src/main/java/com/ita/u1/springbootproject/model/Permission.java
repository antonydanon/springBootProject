package com.ita.u1.springbootproject.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Permission {
    USER_READ("user:read"),
    ADMIN_READ("admin:read");
    private final String permission;
}
