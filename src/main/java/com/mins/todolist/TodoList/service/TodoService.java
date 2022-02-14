package com.mins.todolist.TodoList.service;

import com.mins.todolist.TodoList.domain.todo.TodoRepository;
import com.mins.todolist.TodoList.domain.todo.Todos;
import com.mins.todolist.TodoList.web.dto.TodoResponseDto;
import com.mins.todolist.TodoList.web.dto.TodoSaveRequestDto;
import com.mins.todolist.TodoList.web.dto.TodoUpdateRequestDto;
import com.mins.todolist.TodoList.web.dto.TodosListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository;

    @Transactional
    public Long save(TodoSaveRequestDto requestDto){
        return todoRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, TodoUpdateRequestDto requestDto){
        Todos todos = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 todo가 없습니다. id= "+ id));

        todos.update(requestDto.getCategory(),
                requestDto.getContent(),
                requestDto.getStatus());

        return id;
    }

    public TodoResponseDto findById(Long id){
        Todos entity = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 todo를 찾을 수 없습니다. id= "+id));

        return new TodoResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<TodosListResponseDto> findAllDesc(){
        return todoRepository.findAllDesc().stream().map(TodosListResponseDto::new).collect(Collectors.toList());
    }

    @Transactional
    public void delete(Long id){
        Todos todos = todoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 todo가 없습니다. id= "+id));

        todoRepository.delete(todos);
    }
}
