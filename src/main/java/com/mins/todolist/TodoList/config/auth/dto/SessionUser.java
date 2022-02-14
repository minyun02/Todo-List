package com.mins.todolist.TodoList.config.auth.dto;

import com.mins.todolist.TodoList.domain.user.User;
import lombok.Getter;

@Getter
public class SessionUser {
    //여기에는 인증된 상요자 정보만 필요
    //그 외에 필요한 정보들은 없으니 아래 필드만 선언
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
