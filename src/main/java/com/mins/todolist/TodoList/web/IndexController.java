package com.mins.todolist.TodoList.web;

import com.mins.todolist.TodoList.service.TodoService;
import com.mins.todolist.TodoList.web.dto.TodoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final TodoService todoService;

    @GetMapping("/")
    public String indexPage(Model model){
        model.addAttribute("todos", todoService.findAllDesc());
        return "index";
    }

    @GetMapping("/todos/save")
    public String todosSave(){
        return "todos-save";
    }

    @GetMapping("/todos/update/{id}")
    public String todosUpdate(@PathVariable Long id, Model model){
        TodoResponseDto dto = todoService.findById(id);
        model.addAttribute("todo", dto);
        return "todos-update";
    }
}
