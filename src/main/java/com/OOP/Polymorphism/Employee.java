package com.OOP.Polymorphism;

import com.OOP.Encapsulation.User;
import com.OOP.Inheritance.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee extends BaseEntity {

    private int employeeId;
    private String employeeTask;
    private User employeeManager;

    public void getEmployeeHours(){
        System.out.println("50 hours a week");
    }

}
