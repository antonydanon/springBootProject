package com.ita.u1.springbootproject.controller;

import com.ita.u1.springbootproject.model.UserForAdmin;
import com.ita.u1.springbootproject.model.UserForUser;
import com.ita.u1.springbootproject.service.AdminService;
import com.ita.u1.springbootproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReadController {
    private final AdminService adminService;
    private final UserService userService;

    @GetMapping("/readByAdmin")
    @PreAuthorize("hasAuthority('admin:read')")
    public List<UserForAdmin> getAllForAdmin() {
        return adminService.findAll();
    }

    @GetMapping("/readByUser")
    @PreAuthorize("hasAuthority('user:read')")
    public List<UserForUser> getAllForUser() {
        return userService.findAll();
    }
}
