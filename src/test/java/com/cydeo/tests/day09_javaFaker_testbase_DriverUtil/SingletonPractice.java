package com.cydeo.tests.day09_javaFaker_testbase_DriverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {

@Test(priority=2)
    public void understand_sngleton_test1(){

    String str=Singleton.getword();
    System.out.println("str = " + str);

    String str1=Singleton.getword();
    System.out.println("str1 = " + str1);

    String str2=Singleton.getword();
    System.out.println("str2 = " + str2);

    String str3=Singleton.getword();
    System.out.println("str3 = " + str3);

}
@Test(priority= 1)
    public void understanding_singleton_test2(){
    String str4=Singleton.getword();
    System.out.println("str4 = " + str4);

}




}
