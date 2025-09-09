package com.example.tasklist.repository;

import com.example.tasklist.domain.entity.user.Role;
import com.example.tasklist.domain.entity.user.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsername(String username);

    void insertUserRole(Long userId, Role role);

    boolean isTaskOwner(Long userId, Long taskId);

}
