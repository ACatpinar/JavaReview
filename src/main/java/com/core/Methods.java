package com.core;

public class Methods {

    // controller is the structure that allows to travel between application pages


    public void methodA(){
        System.out.println("Method A is called");
    }

    public void methodA(String str){ // data can be primitive or reference type (object) *-overloading

        System.out.println("methodA(String str) is called");
    }
    public String methodB(){
        return "MethodB is called";
    }
    public String methodB(int x){
        return "MethodB(int x) is called";
    }

    public static void methodC(){   // static methods belong to class, can be called through class name, utility classes are created like that.
        System.out.println("MethodC is called");
    }






}
