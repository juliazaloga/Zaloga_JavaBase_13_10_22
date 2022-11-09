package com.hillel.zaloga.homeworks.homework4;

public class Main {
    public static void main(String[] args) {

        //домашня робота: 1) Паралелепіпед
        int side1 = 12;
        int side2 = 8;
        int side3 = 24;

        int volume = side1 * side2 * side3;
        System.out.println("Volume of parallelepiped = " + volume);

        int length = side1 + side2 + side3;
        System.out.println("Length = " + length);

        System.out.println();
        System.out.println();

        //домашня робота: 2) Китайскі династії

        int soldiersOfEveryTypeDynastyLi = 860;
        int soldiersOfEveryTypeDynastyMin = (int) (soldiersOfEveryTypeDynastyLi * 1.5);
        //LI
        int liSoldiers = 13 * soldiersOfEveryTypeDynastyLi;
        int liBowman = 24 * soldiersOfEveryTypeDynastyLi;
        int liRider = 46 * soldiersOfEveryTypeDynastyLi;

        System.out.println("Li dynasty attack rate = " + (liSoldiers + liBowman + liRider));
        //MIN
        int minSoldiers = 9 * soldiersOfEveryTypeDynastyMin;
        int minBowman = 35 * soldiersOfEveryTypeDynastyMin;
        int minRider = 12 * soldiersOfEveryTypeDynastyMin;

        System.out.println("Min dynasty attack rate = " + (minSoldiers + minBowman + minRider));




        System.out.println();
        System.out.println();


        // Third part
        int a = 700;
        int b = 2000;
        int c = 3500;
        int countMonth10Years = 120; // 12 * 10

        int salary1 = a * countMonth10Years;
        int salary2 = b * countMonth10Years;
        int salary3 = c * countMonth10Years;

        System.out.println(salary1);
        System.out.println(salary2);
        System.out.println(salary3);
        System.out.println();

        double salary1WithoutTax = salary1 - salary1 * 0.05;
        double salary1WithoutTax2 = salary2 - salary2 * 0.05;
        double salary1WithoutTax3 = salary3 - salary3 * 0.05;

        System.out.println(salary1WithoutTax);
        System.out.println(salary1WithoutTax2);
        System.out.println(salary1WithoutTax3);

        System.out.println();
        System.out.println("awg = " + (salary1WithoutTax + salary1WithoutTax2 + salary1WithoutTax3) / 3);
        System.out.println("all = " + (salary1WithoutTax + salary1WithoutTax2 + salary1WithoutTax3));
    }




        static void secondPart() {

//        int var = Math.abs(-15); // модуль
//        System.out.println(var);
//
//        System.out.println(Math.pow(5, 3)); //степинь
//
//        System.out.println(Math.sqrt(16)); //коринь квадратный
//        System.out.println(Math.sqrt(25));

            System.out.println(Math.random()); // вид 0 до 0.9999999999999 [-включно )-не включно
            System.out.println(Math.random() + 1); // 1.0 to 1.999999999999

            System.out.println();

            int random1 = (int) (Math.random() * 11);
            System.out.println(random1);
            System.out.println();

            // from 15 to 30

            int min = 15;
            int max = 30;

            int randomResult = (int) ((Math.random() * (max - min + 1)) + min);
            System.out.println(randomResult);

            System.out.println();

            System.out.println(Math.round(10.4)); // округлення
            System.out.println(Math.round(10.5));

            System.out.println(Math.PI);
            System.out.println(Math.E);
        }



        static void firstPart() {
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

//        System.out.println((double) 10 / 3);
//        System.out.println(10 / (double)3);
//        System.out.println((double) 10 / (double) 3);

        System.out.println();
        System.out.println(a % b); //залишок вид дилення 10/3=3,1

//        int result = a / b;
//        System.out.println("result = " + result);

        int result = 5;
//        result = result + 1; // 6
//        result = result + 1; // +1=7
//        result = result + 1;
//        result ++;
//        result ++;

//        result --;
//        result --;
//
//        --result;
//        --result;

//        System.out.println("result = " + result);
//        System.out.println(10 + ++result);
//        System.out.println("result = " + result);
        System.out.println();

//        int x = 5;
//        int y = 10;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//                                        //5    11     6
////        System.out.println("result " + (x++ + ++y + x++));
//        System.out.println("result " + (x++ + ++y + x++ - y--)); //11
//
//        System.out.println("x = " + x); //6
//        System.out.println("y = " + y);

        System.out.println();
        System.out.println();

        int x = 10;
        int y = 3;

//        x = x + y;
//        System.out.println("x = " + x);
//        x += y;
//        x -= y;
//        x *= y;
//        x /= y;
//        x %= y;


        System.out.println(x);





    }
}
