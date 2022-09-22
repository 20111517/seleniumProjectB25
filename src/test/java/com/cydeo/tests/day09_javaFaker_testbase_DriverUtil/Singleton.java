package com.cydeo.tests.day09_javaFaker_testbase_DriverUtil;

public class Singleton {

//#1-Create private Condtructor
    private Singleton(){}

    private static String word;

    public static String getword(){
        if(word==null){
            System.out.println("First Time call.Word object is null"+"Assigning a value to it now");

            word="something";

    }else {
            System.out.println("Word already has value");
        }
    return word;
    }




}
