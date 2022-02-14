package com.mins.todolist.TodoList.domain.todo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Todos extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;

    @Column(length = 200, nullable = false)
    private String content;

    private String author;

    private String status;

    @Builder
    public Todos(String category, String content, String author, String status) {
        this.category = category;
        this.content = content;
        this.author = author;
        this.status = status;
    }

    public void update(String category, String content, String status) {
        this.category = category;
        this.content = content;
        this.status = status;
    }
}
