package com.hillel.zaloga.homeworks.homework7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Homework

        //Team - 1
        int[] team1 = new int[25];
        int playersT1 = 25;

        int ageFrom = 18;
        int ageTo = 40;

        System.out.print("Players age of team 1: ");
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * (ageFrom - ageTo - 1) + (ageTo + 1));
            if (i == team1.length - 1) {
                System.out.print(team1[i] + ".");
            } else {
                System.out.print(team1[i] + ", ");
            }
        }
        System.out.println();

        int sumAgeT1 = 0;
        for (int i = 0; i < team1.length; i++) {
            sumAgeT1 += team1[i];
            team1[i] = sumAgeT1;
        }

        int middleAgeT1 = sumAgeT1 / playersT1;
        System.out.println("Middle age of team 1: " + middleAgeT1);

        System.out.println();

        //Team - 2
        int[] team2 = new int[25];
        int playersT2 = 25;

        System.out.print("Players age of team 2: ");
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (Math.random() * (ageFrom - ageTo - 1) + (ageTo + 1));
            if (i == team2.length - 1) {
                System.out.print(team2[i] + ".");
            } else {
                System.out.print(team2[i] + ", ");
            }}
        System.out.println();

        int sumAgeT2 = 0;
        for (int i = 0; i < team2.length; i++) {
            sumAgeT2 += team2[i];
            team2[i] = sumAgeT2;
        }

        int middleAgeT2 = sumAgeT1 / playersT2;
        System.out.println("Middle age of team 2: " + middleAgeT2);




//        int[] team = new int[10];
//
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random()* 11);
//        }
//        System.out.println(Arrays.toString(team));
//
//        int sumTeamMain = 0;
//        int sumTeamReserve = 0;
//
//        for (int i = 0; i < team.length; i++) {
//            if (i % 2 == 0){
//                sumTeamMain += team[i];
//            } else {
//                sumTeamReserve += team[i];
//            }
//        }
//        System.out.println(sumTeamMain);
//        System.out.println(sumTeamReserve);


    }

        static void part4 () {

            int[] array1 = {1, 2, 3, 4, 5}; //копіювання масиву вручну
            int[] array2 = new int[array1.length];

            for (int i = 0; i < array1.length; i++) {
                array2[i] = array1[i];
            }
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));

            array2[0] = 99;
            System.out.println();

            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));




        }


        static void part3() {
        int[] array = {1, 44, 98, 44, 22, 33, 55, 22, 98, 10};

        int maxValue1 = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue1) {
                maxValue1 = array[i];
            }
        }
        System.out.println("Max value " + maxValue1);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue1) {
                System.out.println("index: " + i + ", chance: " + maxValue1);
            }

        }








        //VERSION 1
//        int[] people = new int[10];
//
//        for (int i = 0; i < people.length; i++) {
//            people[i] = (int) (Math.random() * 101);
//        }
//        System.out.println(Arrays.toString(people));
//
//        int maxValue = -1;
//        for (int i : people) {
//            if (i > maxValue) {
//                maxValue = i;
//            }
////            maxValue = Math.max(i, maxValue);
//        }
//        System.out.println("Killer percentage: " + maxValue);
//        System.out.println(Math.max());


    }
//-----------------------------------------------------------------------------------------
       static void part2() {

        int[] array = {1, 2, 3, 4, 5, 99};

        System.out.println(array[array.length -1]); //надрукує останнє значення в масиві
        System.out.println(array.length); //кількість значень (довжина масиву)

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // FOR EACH
        for (int value : array) {  //зправа пишемо масив данних, зліва створюється змінна в яку по чезі кладеться значення з масиву
            System.out.print(value + " ");
        }

        }

        static void part1() {  //МАСИВИ

//        int[] array = new int[5]; //вказали довжину масиву
////      якщо довжина масиву 5 то в хіпі комірки номеруватимуться від 0 до 4
//        array[0] = 5;
//        array[1] = 2;
//        array[2] = 4;
//        array[3] = 1;
//        array[4] = 23;  //вручну заповнили його значеня
//
//        System.out.println(array[0]); //номер комірки - індекс масиву
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

//        int[] array2 = new int[] {1, 2, 3, 4, 5}; //вказали значення в такому випадку довжину масиву не пишемо
//        int[] array3 = {1, 2, 3, 4, 5};
//
//        //клас Arrays допомагає процювати з масивами, щоб вивести всі значення масиву toString
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));

//        масив не може бути відємний


//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 10) {
//                System.out.println("Win");
//            }
//        System.out.println(Arrays.toString(array));


//          int[] array = null; //масив = ніщо
//
//          if (array != null) { //перевірка чи масив не дорівнє null, якщо ні то кладемо в нього значення
//              array[0] = 10;
//          }


            int[] array = new int[10];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 11);
            }

//        System.out.println(Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(array[i] + ", ");
                }

            }


        }
    }