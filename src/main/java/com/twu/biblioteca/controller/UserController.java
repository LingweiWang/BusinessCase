package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;

import java.util.ArrayList;

/**
 * Created by apple on 15-6-4.
 */
public class UserController {
    private static ArrayList<User> userList = new ArrayList<User>();
    static{
        userList.add(new User("730-1991","wlw","normal","logged","lwwang","234443837@qq.com","15271862801"));
    }
    public String login (User user){
        user.setStatus("logged");
        return "Welcome!";
    }
    public void quit(User user){
        user.setStatus("logout");
    }
    public User checkUserInformation(String userNumber){
        for(User user : userList){
            if(user.getUserNumber().equals(userNumber) && user.getStatus().equals("logged")){
                return user;
            }
        }
        return null;
    }

}
