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

    private int status;

    private LocalDateTime lastUpdatedDate;

    @Builder
    public TodoUpdateRequestDto(String category, String content, int status, LocalDateTime lastUpdatedDate) {
        this.category = category;
        this.content = content;
        this.status = status;
        this.lastUpdatedDate = lastUpdatedDate;
    }
}
