package Boyce.Adeleke.usersignup.user.service;

import Boyce.Adeleke.usersignup.user.model.User;
import Boyce.Adeleke.usersignup.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImp implements UserService{
    private UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User create(User user){
        return userRepo.save(user);
    }
}
