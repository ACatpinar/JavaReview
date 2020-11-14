package com.Lambda.Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(17);
        list.add(11);
        list.add(14);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,new Comparator());

        System.out.println(list);
         //With Lambda

        //Ascending Order
        Collections.sort(list);

        //Descendng order

        Collections.sort(list,(o1,o2)-> (o1>o2)? -1 : (o1<o2)?1:0);
        System.out.println(list);

        //Ascending order
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);

        //Descending order
        list.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(list);
    }
}
