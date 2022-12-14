package com.hillel.zaloga.homeworks.homework8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Homework


        int[] firmsNumber = new int [9];

        for (int i = 0; i < firmsNumber.length; i++) {
            firmsNumber[i] = (int) (Math.random() * 10);
        }

        int[] playersNumber = new int [9];

        for (int i = 0; i < playersNumber.length; i++) {
            playersNumber[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(firmsNumber);
        Arrays.sort(playersNumber);

        System.out.println();

        System.out.println(Arrays.toString(firmsNumber));
        System.out.println(Arrays.toString(playersNumber));

        int counter = 0;
        for (int i = 0; i < firmsNumber.length; i++) {
            if (firmsNumber[i] == playersNumber[i]) {
                counter++;
                System.out.println("Matched Index: " + i);
            }
        }
        System.out.println("Number of matches: " + counter);













}
        static void task () {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        do {
            System.out.println("Enter array length");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Please enter positive number");
                }
                if (n % 2 != 0) {
                    n = -1;
                    System.out.println("wrong data number must be %2");
                }
            } else{
                System.out.println("Wrong data");
            }

        } while (n <= 0);

        Integer[] array= new Integer [n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));


        int middle = n / 2;
        Integer[] arr1 = new Integer [middle];
        Integer[] arr2 = new Integer[middle];

        System.arraycopy(array, 0, arr1, 0, middle);
        System.arraycopy(array, middle, arr2, 0, middle);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("ater sort");

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder()); //має бути рефренесний тип данних,тому все замінили на інтеджер

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }


         static void part2 () {  //сортування і копіювання масивів

        // natural - сортування від меньшого до більшого
        // reverse - сортування від більшого до меншого
        // bubble sort -

        // int number1 = 5;
        // int number2 = 7;
        //
        // int temp = number1 // temp = 5
        // number1 = number2 // 7
        // number2 = temp //5




        int[] array = {5, 1, 2, 99, 5, 4, 2, 8, 97, 4};
//        int counter = 0;
//        int temp = -1;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] > array[j + 1]) {
//                    temp = array[j];
//                    array[j] = array[j+ 1];
//                    array[j+ 1] = temp;
//                }
//            }
//        }

//        System.out.println(Arrays.toString(array)); // вивести всі значення масиву
//        System.out.println("counter = " + counter);


        Arrays.sort(array); //сортування автоматично відсортує від меньшого до більшого
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array, Collections.reverseOrder()); // відсорує від більшого до меншого, але може бути лише з референсним типом данних, інтеджер


//        int[] array = {5, 1, 2, 99, 5, 4, 2, 8, 97, 4};


//        int max = array[array.length - 1]; //-1 бо масиав пчинається з 0, і остання комірка 9,якщо значень 10
//        int min = array[0]; // 0 перша комірка в масиві


        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) { //вручну знайти більше
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) { //вручну знайти менше
                min = array[i];
            }

//            max = Math.max(max, array[i]); //найбільше значення з масиву
//            min = Math.min(min, array[i]); //найменше значення
        }
//        System.out.println(min);
//        System.out.println(max);

        //копіювання масиву за допомогою метода

        int[] array1 = {1, 2, 3, 6, 8, 9};
//       int[] array2 = Arrays.copyOf(array1, array1.length);//копіювання масиву за допомогою метода
        int[] array2 = Arrays.copyOfRange(array1, 2, 4); //копіювання потрібних елементів від і до

//        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
//
//        array2[0] = 99;
//
//        System.out.println(Arrays.toString(array2));

//        22222
//
//        int[] array1 = {1, 2, 3, 6, 8, 9};

//        int[] array2 = Arrays.copyOf(array1, 2);//якщо в довжину масиву написати частину або наприклад 2, скопіюється масив ілише два перших значення з першого масиву там буде
//        якщо масив який треба зкопіювати 6 комірок, а ми  вказали довжину 10, скопіюється 6 значень і в інші покладе нулі


//        int[] array1 = {1, 2, 3, 6, 8, 9};
//        int[] array2 = new int[array1.length];

//        1- масив з якого будем копіювати, 2- початкова точка з якої комірки копіюємо
//        3- масив в який компіюємо, 4- і в яку комірку очинаємо копіювати, 5- кількість копіюємих елементів
//        System.arraycopy(array1, 0, array2, 0, array1.length);
//        System.arraycopy(array1, 0, array2, array2.length - 2, 2); //копіювання в останні дві комріки

//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));


    }



    static void demoBigO() {

//        // O(N)
//        for (int i = 0; i < 5; i++) {
//
//        }
//
//        // O(N)
//        for (int i = 0; i < 5; i++) {
//
//        }

        // O(2N) = O(N)

//        // O(N) * O(N) = O(N^2)
//        int counter = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 2; j++) {
//                counter++;
//            }
//        }
//        System.out.println(counter);
//
//        // O(N) * O(N) * O(N) = O(N^3)
//        counter = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 2; j++) {
//                for (int k = 0; k < 3; k++) {
//                    counter++;
//                }
//            }
//        }
//
//        System.out.println(counter);
    }

        static void homework7 () {

            int x = 5;
//        while (x <= 2) {
//            System.out.println("Hello");
//            x++;
//        }
//        do {
//            System.out.println("Hello");
//            x++;
//        } while (false);

            int counter = 0;
            for (int i = 123; counter < 100; i++) {
                int number = i;
                int result = number % 10;
                boolean ok = true;
                do {
                    if (result == 4 || result == 9) {
                        ok = false;
                        break;
                    }
                    number /= 10;
                    result = number % 10;
                } while (number > 0);

                if (ok) {
                    System.out.println("number: " + i);
                    counter++;
                }

            }

            System.out.println("count = " + counter);
        }
    }
