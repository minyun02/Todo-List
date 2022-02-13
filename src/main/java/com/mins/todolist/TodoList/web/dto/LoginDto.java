package com.mins.todolist.TodoList.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LoginDto {
    private final String id;
    private final String password;
}
