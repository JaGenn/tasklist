package com.example.tasklist.service;

import com.example.tasklist.domain.user.User;

public interface UserService extends CrudService<User, Long> {

    User getByUsername(String username);

    User create(User user);

    boolean isTaskOwner(Long userId, Long taskId);

}
