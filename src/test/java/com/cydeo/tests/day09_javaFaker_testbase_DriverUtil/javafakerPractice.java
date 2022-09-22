package com.cydeo.tests.day09_javaFaker_testbase_DriverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class javafakerPractice {


@Test
    public  void Test1(){
    Faker faker=new Faker(new Locale("tr"));
    System.out.println("faker.name().firstName() = " + faker.name().firstName());
    System.out.println("faker.name().lastName() = " + faker.name().lastName());
    System.out.println("faker.name().fullName() = " + faker.name().fullName());
    System.out.println("faker.numerify(\"###-###-###\") = " + faker.numerify("###-####-###"));
    System.out.println("faker.numerify(\"0356-###-##-##\") = " + faker.numerify("0356-###-##-##"));
    System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));
    System.out.println("faker.bothify(\"##??-#?#?-###?-##??\") = " + faker.bothify("##??-#?#?-###?-##??"));
}



}
