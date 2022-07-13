package Boyce.Adeleke.usersignup.user.service;

import Boyce.Adeleke.usersignup.user.exceptions.UserNotFoundException;
import Boyce.Adeleke.usersignup.user.model.User;
import Boyce.Adeleke.usersignup.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User create(User user){
        return userRepo.save(user);
    }

    @Override
    public Iterable<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long id) throws UserNotFoundException {
        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isEmpty()) {
            throw  new UserNotFoundException("User does not Exist");
        }

        return userOptional.get();
    }
}
