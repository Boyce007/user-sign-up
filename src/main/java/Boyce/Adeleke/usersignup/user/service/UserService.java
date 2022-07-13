package Boyce.Adeleke.usersignup.user.service;

import Boyce.Adeleke.usersignup.user.Exceptions.UserCreationException;
import Boyce.Adeleke.usersignup.user.model.User;

public interface UserService {
    User create(User user) throws UserCreationException;
    Iterable<User> getAllUser ();
}

