package com.core;

public class SelectionStatements {

    public static void DemoIfStatement(){
        String userName = "Nelson";

        if (userName.equals("Nelson")){
            System.out.println("PASS");

        }else if(!userName.equals("Nelson")){
            System.out.println("Fail");

        }else {
            System.out.println("Invalid");
        }
    }

    public static void demoSwitchCaseStatement(){
        String userName = "Nelson";
        switch (userName) {
            case "Oz":
                System.out.println("Fail");
                break;
            case "Mike":
                System.out.println("Not described");
                break;
            case "Nelson":
                System.out.println("Pass");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
