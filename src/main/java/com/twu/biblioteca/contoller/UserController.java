package com.twu.biblioteca.contoller;

import com.twu.biblioteca.model.User;

/**
 * Created by apple on 15-6-4.
 */
public class UserController {
    public String login (User user){
        user.setStatus("logged");
        return "Welcome!";
    }
    public void quit(User user){
        user.setStatus("logout");
    }
}
