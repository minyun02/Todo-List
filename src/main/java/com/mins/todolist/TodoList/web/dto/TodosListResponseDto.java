package com.mins.todolist.TodoList.web.dto;

import com.mins.todolist.TodoList.domain.todo.Todos;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TodosListResponseDto {
    private Long id;
    private String category;
    private String content;
    private String author;
    private String status;
    private LocalDateTime modifiedDate;

    public TodosListResponseDto(Todos entity){
        this.id = entity.getId();
        this.category = entity.getCategory();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.status = entity.getStatus();
        this.modifiedDate = entity.getModifiedDate();
    }
}
