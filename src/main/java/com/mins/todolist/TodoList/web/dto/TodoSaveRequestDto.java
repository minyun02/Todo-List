package com.mins.todolist.TodoList.web.dto;

import com.mins.todolist.TodoList.domain.Todos;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class TodoSaveRequestDto {
    private String category;

    private String content;

    private String author;

    private int status;

    private LocalDateTime createdDate;

    private LocalDateTime lastUpdatedDate;

    @Builder
    public TodoSaveRequestDto(String category, String content, String author, int status, LocalDateTime createdDate, LocalDateTime lastUpdatedDate) {
        this.category = category;
        this.content = content;
        this.author = author;
        this.status = status;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Todos toEntity(){
        return Todos.builder()
                .category(category)
                .content(content)
                .author(author)
                .status(status)
                .createdDate(createdDate)
                .lastUpdatedDate(lastUpdatedDate)
                .build();
    }
}
