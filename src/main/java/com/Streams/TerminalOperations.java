package com.Streams;

import com.Collections.ArrayList;
import com.OOP.Encapsulation.Role;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {

        System.out.println("===============COUNT================");

       long count =  Arrays.asList(1,2,3,4,5,6,7,8,2,3,6,4).stream().count();
        System.out.println(count);

        long count2 = Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream().filter(str->str.equals("Apple")).count();
        System.out.println(count2);

        System.out.println("===============FIND FIRST -FIND ANY================");

        Role  r  = ArrayList.createRole().stream().filter(role -> role.getDesc().equals("Employee")).findFirst().get();
        System.out.println(r.getId());

        Role r1 = ArrayList.createRole().stream().filter(role -> role.getDesc().equals("Employee")).findAny().get();
        System.out.println(r1.getId());

        System.out.println("===============COLLECT================");

        List<String> appleList  =Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream().filter(s->s.equals("Apple")).collect(Collectors.toList());
        System.out.println(appleList.stream().count());

        











    }
}
