package com.ita.u1.springbootproject.service;

import com.ita.u1.springbootproject.model.User;
import com.ita.u1.springbootproject.model.UserForAdmin;
import com.ita.u1.springbootproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final UserRepository userRepository;

    public List<UserForAdmin> findAll() {
        List<User> allUsers = userRepository.findAll();
        List<UserForAdmin> usersForAdmin = new ArrayList<>();
        for (User user : allUsers) {
            usersForAdmin.add(new UserForAdmin(user.getId(), user.getEmail(), user.getName()));
        }
        return usersForAdmin;
    }
}
