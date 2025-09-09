package com.example.tasklist.repository.impl;

import com.example.tasklist.domain.entity.task.Task;
import com.example.tasklist.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class TaskRepositoryImpl implements TaskRepository {
    @Override
    public List<Task> findAllByUserId(Long userId) {
        return List.of();
    }

    @Override
    public void assignToUserById(Long taskId, Long userId) {

    }

    @Override
    public Optional<Task> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void create(Task entity) {

    }

    @Override
    public void update(Task entity) {

    }

    @Override
    public void delete(Long aLong) {

    }
}
