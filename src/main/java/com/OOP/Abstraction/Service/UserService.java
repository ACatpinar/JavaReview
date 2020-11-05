package com.OOP.Abstraction.Service;

import com.OOP.Abstraction.Implementation.UserServiceImplementation;
import com.OOP.Encapsulation.Role;
import com.OOP.Encapsulation.User;

public class UserService implements UserServiceImplementation {
    @Override
    public String userByRoleId(int id) {
        User user = new User("Mike","Smith",new Role(1,"Admin"));
        return user.getFirstName()+" "+user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User("Tom","Ally",new Role(15,"Employee"));
        return user;

    }

}
