package com.mins.todolist.TodoList.web;

import com.mins.todolist.TodoList.config.auth.LoginUser;
import com.mins.todolist.TodoList.config.auth.dto.SessionUser;
import com.mins.todolist.TodoList.service.TodoService;
import com.mins.todolist.TodoList.web.dto.TodoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final TodoService todoService;
    private final HttpSession httpSession;

    @GetMapping("/")
    public String indexPage(Model model){
        model.addAttribute("todos", todoService.findAllDesc());

        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        if(user != null){
            model.addAttribute("userName", user.getName());
        }
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
