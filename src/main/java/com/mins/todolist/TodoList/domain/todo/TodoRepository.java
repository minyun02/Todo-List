package com.mins.todolist.TodoList.domain.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todos, Long> {

    @Query("select t from Todos t order by t.id desc")
    List<Todos> findAllDesc();
}
