package com.mins.todolist.TodoList.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class TodoUpdateRequestDto {

    private String category;

    private String content;

    private String status;

    @Builder
    public TodoUpdateRequestDto(String category, String content, String status) {
        this.category = category;
        this.content = content;
        this.status = status;
    }
}
