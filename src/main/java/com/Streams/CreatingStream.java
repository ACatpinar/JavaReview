package com.Streams;

import com.Collections.ArrayList;
import com.OOP.Encapsulation.Role;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //Creating stream from an Array

        String [] courses = {"Java","Selenium","CSS","Api","JS"};

        Stream <String> courseStream = Arrays.stream(courses);

        //Creating a string from a collection

        Stream<Role> roleStream = ArrayList.createRole().stream();

        //Creating a Stream from specified values
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);

        System.out.println(stream);
    }
}
