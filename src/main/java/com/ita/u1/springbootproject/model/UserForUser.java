package com.ita.u1.springbootproject.model;

import lombok.Data;

@Data
public class UserForUser {
    private Long id;
    private String name;

    public UserForUser(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
