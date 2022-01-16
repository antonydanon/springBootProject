package com.ita.u1.springbootproject.model;

import lombok.Data;

@Data
public class UserForAdmin {
    private Long id;
    private String email;
    private String name;

    public UserForAdmin(Long id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }
}
