package com.Lambda.Sorting;

import com.OOP.Encapsulation.Role;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private Integer employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeCity;
    private Role role;
}