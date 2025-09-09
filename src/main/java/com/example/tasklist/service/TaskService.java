package com.example.tasklist.service;

import com.example.tasklist.domain.task.Task;

import java.util.List;

public interface TaskService extends CrudService<Task, Long> {

    List<Task> getAllByUserId(Long userId);

    Task create(Task task, Long userId);

}
