package com;

import com.OOP.Encapsulation.Role;
import com.OOP.Encapsulation.User;
import com.OOP.Inheritance.Project;
import com.core.Loops;
import com.core.Methods;
import com.core.SelectionStatements;

public class Main {

    public static void main(String[] args) {

        //***************CORE***********//
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());
        System.out.println(methods.methodB(5));
        Methods.methodC();  //static method can be called through class name;

        //***************LOOPS***********//
        Loops.DemoFori();
        Loops.DemoIter();

        //***************Selection***********//

        SelectionStatements.DemoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();

        //***************OOP - Encapsulation***********//

        User user = new User("Nelson","Cannwyll",new Role(2,"Anyone"));
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDesc());

        //***************OOP - Inheritance***********//

        //Project Object












    }
}
