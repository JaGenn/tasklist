package com.example.tasklist.service.impl;


import com.example.tasklist.domain.user.User;
import com.example.tasklist.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public User getById(Long userId) {
        return null;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public void delete(Long userId) {

    }
}
