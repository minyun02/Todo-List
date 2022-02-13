package com.mins.todolist.TodoList.web.dto;

import com.mins.todolist.TodoList.domain.Todos;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TodoResponseDto {
    private Long id;

    private String category;

    private String content;

    private String author;

    private int status;

    private LocalDateTime createdDate;

    private LocalDateTime lastUpdatedDate;

    public TodoResponseDto(Todos entity){
        this.id = entity.getId();
        this.category = entity.getCategory();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.status = entity.getStatus();
        this.createdDate = entity.getCreatedDate();
        this.lastUpdatedDate = entity.getLastUpdatedDate();
    }
}
