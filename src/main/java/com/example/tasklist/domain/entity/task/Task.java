package com.example.tasklist.domain.entity.task;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable {

    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime expirationDate;

}
