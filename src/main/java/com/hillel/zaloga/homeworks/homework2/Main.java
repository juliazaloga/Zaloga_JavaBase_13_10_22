package com.hillel.zaloga.homeworks.homework2;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //цилочысельни
        byte myAge;

        myAge = -128;
        System.out.println(myAge);

        myAge = 127;
        System.out.println(myAge);

        short length = 32000;

        int someInteger = 2_000_000_000;
        int someInteger1 = 2000000000;
        System.out.println(someInteger);
        System.out.println(someInteger1);


        long someLong = 2134568997654335L;

        System.out.println();
        System.out.println();

        //дробови
        float volume = 11.1234567890123456F;
        System.out.println(volume);

        double someDoubleVariable = 11.1234567890123456;
        System.out.println(someDoubleVariable);

        System.out.println();
        System.out.println();

        //сымволы
        char categoryDriverLicense1 = 'A';
        char categoryDriverLicense2 = 65;
        char categoryDriverLicense3 = '\uffff';

        System.out.println(categoryDriverLicense1);
        System.out.println(categoryDriverLicense2);
        System.out.println(categoryDriverLicense3);

        //логичный тып данных
        boolean isCat = false;
        boolean isDog = true;
        System.out.println();
        System.out.println();

        //--------------------------------------------------------------------//
//        byte age = 28;
//        int bigAge = age;
//        System.out.println(bigAge);


        char charA = 'A';
        int intageA = charA;
        System.out.println(intageA);

        // ERROR!!!
//        boolean demoBoolean = true;
//        intageA = demoBoolean;

        System.out.println();
        System.out.println();

        int bigAge = -500;
        byte age = (byte) bigAge;
        System.out.println(age);

        System.out.println();
        System.out.println();

//        double applePriceDoble = 54.88;
//        int applePriceInt = (int) applePriceDoble;
//        System.out.println(applePriceInt);


        int applePriceInt = 54;
        double applePriceDoble = applePriceInt;
        System.out.println(applePriceDoble);

        // референсный тып данных- heap -0, прмитывный- stack - п
        String name = "Julia";
        String name2 = "Julia";
        String name3 = "Julia";

        String str = "age = " + 28 + 12;
        System.out.println(str);

        System.out.println();
        System.out.println();

        System.out.println("угмтрфзукомщ");

        System.out.println();
        System.out.println();

        //домашня робота
        double latitude = 52.2326063;
        double longitude = 20.7810167;
        char degree = '\u00B0';

        System.out.println("latitude " + latitude + degree);
        System.out.println("longitude " + longitude + degree);


    }
}
