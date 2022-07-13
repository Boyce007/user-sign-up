package Boyce.Adeleke.usersignup.user.service;

import Boyce.Adeleke.usersignup.user.exceptions.UserCreationException;
import Boyce.Adeleke.usersignup.user.exceptions.UserNotFoundException;
import Boyce.Adeleke.usersignup.user.model.User;

public interface UserService {
    User create(User user) throws UserCreationException;

    Iterable<User> getAllUser ();
    User getUserById(Long id) throws UserNotFoundException;
}

