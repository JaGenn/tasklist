package com.example.tasklist.service;

import com.example.tasklist.domain.entity.task.Task;
import com.example.tasklist.domain.entity.task.TaskImage;

import java.util.List;

public interface TaskService extends CrudService<Task, Long> {

    List<Task> getAllByUserId(Long userId);

    Task create(Task task, Long userId);

    void uploadImage(Long id, TaskImage image);

}
