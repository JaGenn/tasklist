package com.example.tasklist.service;


import com.example.tasklist.domain.MailType;
import com.example.tasklist.domain.entity.task.Task;
import com.example.tasklist.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

@Service
@RequiredArgsConstructor
public class Reminder {

    private final TaskService taskService;
    private final UserService userService;
    private final MailService mailService;
    private final Duration DURATION = Duration.ofHours(1);

    @Scheduled(cron = "0 0 * * * *")
    public void remindForTask() {
        List<Task> tasks = taskService.getAllSoonTasks(DURATION);
        tasks.forEach(task -> {
            User user = userService.getTaskAuthor(task.getId());
            Properties props = new Properties();
            props.setProperty("task.title", task.getTitle());
            props.setProperty("task.description", task.getDescription());
            mailService.sendEmail(user, MailType.REMINDER, props);
        });
    }
}
