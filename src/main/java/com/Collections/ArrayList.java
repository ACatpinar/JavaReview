package com.Collections;

import com.Enum.Gender;
import com.OOP.Encapsulation.Role;
import com.OOP.Encapsulation.User;

import java.util.List;


public class ArrayList {

    public static void CreateList(){
        List<Integer> list = new java.util.ArrayList<>();
        list.add(5);list.add(10);list.add(20);

        for (Integer integer : list) {
            System.out.println(list);
        }

    }

    public static void createUserList(){
        List<User> userList = new java.util.ArrayList<>();
        userList.add(new User("Kelly","Clarkson",new Role(1,"Manager"), Gender.FEMALE));
        userList.add(new User("Ally","Octo",new Role(2,"Admin"),Gender.FEMALE));

        for (User user : userList) {
            System.out.println(user.getRole().getDesc());
        }


    }

    public static List<Role> createRole(){
        List<Role> roleList = new java.util.ArrayList<>();
        roleList.add(new Role(3,"User"));
        roleList.add(new Role(4,"Employee"));
        roleList.add(new Role(5,"Employee"));
        roleList.add(new Role(6,"Employee"));
        roleList.add(new Role(7,"Admin"));
        return roleList;

    }
}
