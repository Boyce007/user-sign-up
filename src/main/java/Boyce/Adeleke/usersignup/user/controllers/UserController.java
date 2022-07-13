package Boyce.Adeleke.usersignup.user.controllers;

import Boyce.Adeleke.usersignup.user.model.User;
import Boyce.Adeleke.usersignup.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    //@GetMapping("/users")
   // public Iterable<User>getAllUsers()
}
