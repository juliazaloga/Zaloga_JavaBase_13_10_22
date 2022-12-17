package com.hillel.zaloga.homeworks.homework10;

public class Main {
    public static void main(String[] args) {

        //homework

        personInfo("Will", "Smith", "New York", "2936729462846");
        personInfo("Jackie", "Chan", "Shanhai", "12312412412");
        personInfo("Sherlock", "Holms", "London", "37742123513");
    }

    static void personInfo(String name, String surname, String city, String phoneNumber)  {
        System.out.println("Зателефонувати громадянину " + name + " " + surname
        + " із міста " + city + " можна за номером " + phoneNumber);
    }




//        demoMethod();
//        System.out.println("fythiuj");
//        printGreeting("Dan");
//        printGreeting("Alex");

//        int number = 5;
//        changeValue(number);
//        System.out.println(number);

//
//        int sum = sum(10, 5);
//        System.out.println(sum);
//
//        System.out.println(sum(4, 8));

//        int result = sum(getNumber1(), getNumber2());
//        System.out.println(result);
    }

//    static int sum(int number, int number2) {
//        int result = number + number2;
//        return result;
//    }
//
//    static int getNumber1() {
//        return 10;
//    }
//
//    static int getNumber2() {
//        return 15;
//    }
//
//
//    static void changeValue(int number) { //в number  поклалось 5 з головного методу main
//        number += 10; // 5 + 10 = 15, тобто  вже number 15, але в головному методі main змінна не змінюється
////        це овністю дві різні змінні в різних стеках
//        System.out.println("number from method " + number);
//    }
//
//    static void demoMethod() {
//        //void - метод який буде запущений,відпрацьований але нічого не повертає
//        System.out.println("Hello World");
//    }
//
//    static void printGreeting(String name) {
//        System.out.println("Hello " + name);
//    }


















