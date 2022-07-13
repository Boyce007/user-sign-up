package Boyce.Adeleke.usersignup.user.controllers;

import Boyce.Adeleke.usersignup.user.exceptions.UserCreationException;
import Boyce.Adeleke.usersignup.user.exceptions.UserNotFoundException;
import Boyce.Adeleke.usersignup.user.model.User;
import Boyce.Adeleke.usersignup.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/users/{id}")
    public User getById(@PathVariable("id") Long id) throws UserNotFoundException {
        return userService.getUserById(id);
    }
}
