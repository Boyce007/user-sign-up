package Boyce.Adeleke.usersignup.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    private String firstName;
    private String lastName;
    private String password;
    @Id
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }


    public String toString() {
        return String.format("%s %s %s %s", firstName, lastName, email, password);
    }
}
