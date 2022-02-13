package com.mins.todolist.TodoList.web.todo;

import com.mins.todolist.TodoList.service.TodoService;
import com.mins.todolist.TodoList.web.dto.TodoResponseDto;
import com.mins.todolist.TodoList.web.dto.TodoSaveRequestDto;
import com.mins.todolist.TodoList.web.dto.TodoUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class TodoApiController {

    private final TodoService todoService;

    @PostMapping("/api/todos")
    public Long save(@RequestBody TodoSaveRequestDto requestDto){
        return todoService.save(requestDto);
    }

    @PutMapping("/api/todos/{id}")
    public Long update(@PathVariable Long id, @RequestBody TodoUpdateRequestDto requestDto){
        return todoService.update(id, requestDto);
    }

    @GetMapping("/api/todos/{id}")
    public TodoResponseDto findById(@PathVariable Long id){
        return todoService.findById(id);
    }
}
