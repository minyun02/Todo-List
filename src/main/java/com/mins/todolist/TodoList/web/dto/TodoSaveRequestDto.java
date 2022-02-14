package com.mins.todolist.TodoList.web.dto;

import com.mins.todolist.TodoList.domain.todo.Todos;
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

    private String status;

    @Builder
    public TodoSaveRequestDto(String category, String content, String author, String status) {
        this.category = category;
        this.content = content;
        this.author = author;
        this.status = status;
    }

    public Todos toEntity(){
        return Todos.builder()
                .category(category)
                .content(content)
                .author(author)
                .status(status)
                .build();
    }
}
