package com.ita.u1.springbootproject.service;

import com.ita.u1.springbootproject.model.User;
import com.ita.u1.springbootproject.model.UserForUser;
import com.ita.u1.springbootproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserForUser> findAll() {
        List<User> allUsers = userRepository.findAll();
        List<UserForUser> usersForUser = new ArrayList<>();
        for (User user : allUsers) {
            usersForUser.add(new UserForUser(user.getId(), user.getName()));
        }
        return usersForUser;
    }
}

