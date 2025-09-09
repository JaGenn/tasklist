package com.example.tasklist.repository;

import com.example.tasklist.domain.task.Task;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findAllByUserId(Long userId);

    void assignToUserById(Long taskId, Long userId);
}
