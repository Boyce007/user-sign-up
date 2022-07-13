package Boyce.Adeleke.usersignup;

import Boyce.Adeleke.usersignup.user.model.User;
import Boyce.Adeleke.usersignup.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class UserSignUpApplication {
	private static Logger logger = LoggerFactory.getLogger(UserSignUpApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UserSignUpApplication.class, args);
	}


}