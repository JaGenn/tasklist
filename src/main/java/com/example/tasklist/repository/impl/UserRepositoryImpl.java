package com.example.tasklist.repository.impl;

import com.example.tasklist.domain.user.Role;
import com.example.tasklist.domain.user.User;
import com.example.tasklist.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public void insertUserRole(Long userId, Role role) {

    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void create(User entity) {

    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(Long aLong) {

    }
}
