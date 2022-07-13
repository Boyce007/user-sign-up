package Boyce.Adeleke.usersignup.user.controllers;

import Boyce.Adeleke.usersignup.user.Exceptions.UserCreationException;
import Boyce.Adeleke.usersignup.user.model.User;
import Boyce.Adeleke.usersignup.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return userService.getAllUser();
    }

    @PostMapping("/users")
    public User create(@RequestBody User user) throws UserCreationException {
        return userService.create(user);
    }
}
