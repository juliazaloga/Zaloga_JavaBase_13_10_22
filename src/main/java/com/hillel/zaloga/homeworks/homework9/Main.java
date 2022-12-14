package com.hillel.zaloga.homeworks.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //homework

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int m = 0;


        for ( ; ; ) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                System.out.println("you entered number: " + n);
                break;
            } else {
                System.out.println("Wrong value, try again!");
                scanner.nextLine();
            }
        }

        for ( ; ; ) {
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                System.out.println("you entered number: " + m);
                break;
            } else {
                System.out.println("Wrong value, try again!");
                scanner.nextLine();
            }
        }

        int[][] array = new int [m][n];
        int[][] array1 = new int [n][m];

        // array

        System.out.println("before");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("after");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array1[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }














        // 3 рядки, в кожному з них по 2 рядки, і в кожному з них о 4 стовбці
//        int[][][] array1 = new int[3][2][4];
////        int[][][] array = {
//                {
//                        {18, 28, 18, 28},
//                        {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5},
//                        {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19, 55},
//                        {1, 7, 38, 11}
//                }
//        };
//        System.out.println(Arrays.deepToString(array));
//
//        // друкування трьохвимірного масиву
//        //lenght  кількість вкладених обьєктів (3)
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) { // .дістаємо кількісь рядків у двовимірному масиві (2)
//                for (int k = 0; k < array[i][j].length; k++) { //.дістаємо кількість стовбців в конкретному обьєкті двовимірного масиву
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//        //цей метод дістає лише одновимірні масиви (дістати з трьохвимірного одновимірний масив
//        System.out.println(Arrays.toString(array[2][0])); // 2- індекс обьекту, 0- рядок обьекту

//        System.out.println(array.length); // кількіть двохвимірних і тд масивів (рядків),кількість елементів
//
//        System.out.println(array[0].length); //кількість рядків в кожному із підмасивів
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);
//
//        System.out.println(array[0][0].length); //кількість стовпців конкретно в одному із масивів,кількість совбців в першому рядку
//        System.out.println(array[0][1].length); //кількість стовбців в другому рядку
//
//        //конкретне значення із комірки
//        System.out.println(array[0][0][0]); //обьект 0, рядок 0, стовпець 0
//        System.out.println(array[0][0][1]); //обьект 0, рядок 0, стовпець 1
//        System.out.println(array[0][0][2]);
//        System.out.println(array[0][0][3]);

        //чотирьох вимірний масив
//        int[][][][] array = new int [2][3][6][6];

//        int[][][][] array =
//                {
//                        {
//                                {
//                                        {18, 28, 18, 28},
//                                        {45, 90, 45, 0}
//                                },
//                                {
//                                        {7, 125, 500, 5},
//                                        {0, 11, 25, 30}
//                                },
//                                {
//                                        {81, 17, 19, 55},
//                                        {1, 7, 38, 11}
//
//                                }
//                        },
//                        {
//                                {
//                                        {18, 28, 18, 28},
//                                        {45, 90, 45, 0}
//                                },
//                                {
//                                        {7, 125, 500, 5},
//                                        {0, 11, 25, 30}
//                                },
//                                {
//                                        {81, 17, 19, 55},
//                                        {1, 7, 38, 11}
//
//                                }
//                        }
//
//                };
//
//        //
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    for (int l = 0; l <array[i][j][k].length; l++) {
//                    System.out.print(array[i][j][k][l] + "\t");
//                }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        //транспортування матриць

//        int[][] array3 = new int[4][4];
//        for (int i = 0; i < array3.length; i++) {
//            for (int j = 0; j < array3[i].length; j++) {
//                array3[i][j] = (int) (Math.random() * 101);
//            }
//        }
//
//        System.out.println("before");
//
//        for (int i = 0; i < array3.length; i++) {
//            for (int j = 0; j < array3[i].length; j++) {
//                System.out.print(array3[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int i = 0; i < array3.length; i++) {
//            for (int j = i + 1; j < array3[i].length; j++) {
//                int temp = array3[i][j];
//                array3[i][j] = array3[j][i];
//                array3[j][i] = temp;
//            }
//        }
//        System.out.println("after");
//
//        for (int i = 0; i < array3.length; i++) {
//            for (int j = 0; j < array3[i].length; j++) {
//                System.out.print(array3[i][j] + "\t");
//            }
//            System.out.println();
//        }
























    }
        static void part2 () {
        //      За допомогою циклів створити шахівницю 8х8 виду:
//
//      B W B W B W B W  // 00, 02, 04, 06 - 0, 2, 4, 6
//      W B W B W B W B  // 11, 13, 15, 17 - 2, 4, 6, 8
//      B W B W B W B W  // 20, 22, 24, 26 - 2, 4, 6, 8
//      W B W B W B W B  // 31, 33, 35, 37 - 4, 6, 8, 10
//      B W B W B W B W
//      W B W B W B W B
//      B W B W B W B W
//      W B W B W B W B

        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "B";
                } else {
                    array[i][j] = "W";
                }

             //тринарний оператор
//             array[i][j] = ((i + j) % 2 == 0) ? "B" : "W";
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }











    }
        static void part1() {   //Багатовимірні масиви
////        int[][] array = new int [3][3];   //[10][3];
////        array[0][0] = 10;
////
////        System.out.println(array.length); //покаже лише кількість рядків (10був приклад),(3) , не показує ствопці.
//
            // створення масиву
//        int[][] array2 = {    //3 рядки по 3 стовпці
//                {1, 2, 3}, //00, 01, 02
//                {2, 3, 4}, //10, 11, 12
//                {5, 6, 7} //20, 21. 22
//        };
            //довжина масиву + кількість стовпців
//            System.out.println(array.length);
//            System.out.println(array[0].length);
//            System.out.println(array[1].length);
//            System.out.println(array[2].length);
//            System.out.println(array[3].length);

//        System.out.println(Arrays.deepToString(array2));

//          //друкування масиву
//        for (int i = 0; i < array2.length; i++) { //рядок
//            for (int j = 0; j < array2[i].length; j++) { //стовбці, тут вказувати довжину тільки якщо рядки і стовбці рівні (3на3)
//                System.out.print(array2[i][j] + "\t"); //т- 4 робіли
//            }
//            System.out.println();
////        }

            // друкування масиву і заповнення рандомними числами
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length; j++) {
//                    array[i][j] = (int) (Math.random() * 101);
//                    System.out.print(array[i][j] + "\t");
//                }
//                System.out.println();
//            }
//
//        int[][] array2 = { //зубчатий масив
//                {1, 2, 3, 4, 5},
//                {2},
//                {5, 6, 7},
//                {1, 2, 3, 4, 34},
//                {},
//                {3, 3, 3}
//        };
//
//        for (int i = 0; i < array2.length; i++) { //рядки
//            for (int j = 0; j < array2[i].length; j++) { //стовбці
//                System.out.print(array2[i][j] + "\t");
//
//            }
//            System.out.println();
//        }


            //ЗАВДАННЯ перша діагональ
        //version1
        int[][] array = new int[5][5];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        //version 2
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }


            // друга діагональ
//        //version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        //version 2
//        for (int i = 0; j = array.length - 1; i < array.length; i++, j--) {
//            if (i + j == array.length - 1)
//                    array[i][j] = 1;
//        }


        //version3

        for (int i = 0; i < array.length; i++) {
            array[i][array[i].length - 1 - i] = 1;

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }}
