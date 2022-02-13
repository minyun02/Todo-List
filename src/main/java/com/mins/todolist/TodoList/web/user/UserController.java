package com.mins.todolist.TodoList.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String indexPage(){
        return "뭘 보내줘야할까??";
    }
}
