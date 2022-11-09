package com.hillel.zaloga.homeworks.homework4;

public class homework4 {
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
}
