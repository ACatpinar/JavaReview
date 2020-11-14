package com.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {

        Integer [] numbersArray = {1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> numbersStream = Arrays.stream(numbersArray);

        System.out.println("*************FILTER******************");

        //filter
        System.out.println(numbersStream.filter(number -> number % 2 != 0).count());

        Stream<String> stringStream = Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream();

        System.out.println(stringStream.filter(str -> str.length() == 5).count());

        //System.out.println(stringStream.filter(str -> str.startsWith("A")).count()); //Error

        Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream().filter(str-> str.equals("Apple")).forEach(str-> System.out.println(str));

        System.out.println("*************MAP******************");

        Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream().map(str-> str.toUpperCase()).forEach(str-> System.out.println(str));

        System.out.println("*************Distinct******************");

        Arrays.asList("Apple","Orange","Kiwi","Banana","Apple","Cherry","Mango").stream().distinct().forEach(str-> System.out.println(str));

        System.out.println("*************Sorted Order******************");

        Arrays.asList(1,3,2,4,5,6,7,8,9).stream().sorted().forEach(str-> System.out.println(str));

        System.out.println("************* Reverse Sorted Order******************");

        Arrays.asList(1,3,2,4,5,6,7,8,9).stream().sorted(Comparator.reverseOrder()).forEach(number-> System.out.println(number));











    }
}
