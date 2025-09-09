package com.example.tasklist.web.dto.user;


import com.example.tasklist.web.dto.validation.OnCreate;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDto {

    @NotNull(message = "Id must be not null.", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Name must be not null.", groups = {OnCreate.class, OnUpdate.class })
    @Max(value = 255, message = "Name length must be smaller than 255 symbols.", groups = {OnCreate.class, OnUpdate.class })
    @Min(value = 5, message = "Name length must be more than 5 symbols.", groups = {OnCreate.class, OnUpdate.class })
    private String name;

    @NotNull(message = "Username must be not null.", groups = {OnCreate.class, OnUpdate.class })
    @Max(value = 255, message = "Username length must be smaller than 255 symbols.", groups = {OnCreate.class, OnUpdate.class })
    @Min(value = 5, message = "Username length must be more than 5 symbols.", groups = {OnCreate.class, OnUpdate.class })
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must be not null.", groups = {OnCreate.class, OnUpdate.class })
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password confirmation must be not null.", groups = OnCreate.class)
    private String passwordConfirmation;

}
