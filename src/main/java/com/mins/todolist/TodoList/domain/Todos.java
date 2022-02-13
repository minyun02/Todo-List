package com.mins.todolist.TodoList.domain;

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
public class Todos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;

    @Column(length = 200, nullable = false)
    private String content;

    private String author;

    private int status;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;

    @Builder
    public Todos(String category, String content, String author, int status, LocalDateTime createdDate, LocalDateTime lastUpdatedDate) {
        this.category = category;
        this.content = content;
        this.author = author;
        this.status = status;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public void update(String category, String content, int status, LocalDateTime lastUpdatedDate) {
        this.category = category;
        this.content = content;
        this.status = status;
        this.lastUpdatedDate = lastUpdatedDate;
    }
}
