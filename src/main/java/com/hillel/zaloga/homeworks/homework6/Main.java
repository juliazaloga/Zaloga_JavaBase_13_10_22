package com.hillel.zaloga.homeworks.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        FOR (Блок ініціалізаціі ітератора;  -виконуэться 1 раз
//             Блок умови виходу з циклу;  // якщо пустый то думаэ що тру
//             Блок зміни ітератора; (++ або --) // якщо пустый то повторюэ безкинечно ту i
//               {  kod  }


//        for (int i = 0; true; i++) {
//
//            if ( i == 5 || i ==4) {
//                continue; // обриваэ поточну информацию (все що написано знизу не буде выконано саме в ций итерации)
//            }
//            System.out.println(i);
//
//            if ( i == 5) {
//                break;  // обривання циклу коли и == 5 , краще ставити перед контин"ю
//            }
//        }


//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {  // вси парни вид 0 до 20
//                System.out.println(i);
//            }
//
//        }

//        int number1 = 0;
//        int number2 = 1;
//        int sum;
//        System.out.print(number1 + " " + number2 + " ");
//        for (int i = 0; i < 9; i++) {
//            sum = number1 + number2;
//            System.out.print(sum + " ");
//            number1 = number2;
//            number2 = sum;
//        }


//        Scanner scanner = new Scanner(System.in);
//        for (; ; ) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                System.out.println("you entered number" + number);
//                break; // безкинечный цыкл до моменту покы корыстувач не введе чысло
//
//            } else {
//                System.out.println("wrong");
//                scanner.nextLine(); // холостий выклык для зачысткы буферу. див урок 5
//            }
//        }


//        int i = 0;
//        while (i < 10) {
//            i++;
//            if (i >= 10) {
//                break;
//            }
//            if (i == 5 || i == 7) {
//                continue;
//            }
//            System.out.println("hello world - " + i);
////            i++; // якщо э континью то итератор треа ставыты до нього
//
//        }


//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                System.out.println("you entered number" + number);
//                break; // безкинечный цыкл до моменту покы корыстувач не введе чысло
//
//            } else {
//                System.out.println("wrong");
//                scanner.nextLine(); // холостий выклык для зачысткы буферу. див урок 5
//            }
//        }
//          int i = 10;
//          while (i >= 0) {
//
//              int randomN = (int) (Math.random() * 101);
//
//              System.out.println(i);
//
//              if (randomN >= 85 && randomN <= 100) {
//                  System.out.println("win");
//                  break;
//              }
//              if (i == 0) {
//                  System.out.println("boooom");
//              }
//              i--;
//          }

//        Scanner scanner = new Scanner(System.in);
//
//        int factorial = -1;
//        while (true) {
//            System.out.println("Please enter factorial from 1 to 10");
//            if (scanner.hasNextInt()) {
//                factorial = scanner.nextInt();
//                if (factorial >= 1 && factorial <= 10) {
//                    break;
//                } else {
//                    System.out.println("1-10");
//                }
//            } else {
//                System.out.println("wrong number, try again from 1 to 10");
//                scanner.nextLine();
//            }
//            }
//
//        int result = 1;
//        for (int i = 1; i <= factorial; i++) {
////            result = result * i;
//            result *= i;
//        }
//        System.out.println(result);


//        BINARY SYSTEM
//        int a = 3; // 0- фолс , 1 - тру, поривнюються вси 4 на кожни позиции |
//        int b = 11;
//
//        System.out.println(0 + "" + 0 + "" + Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
//        System.out.println();

//        System.out.println(a | b);
//        System.out.println(Integer.toBinaryString(a | b));

//        System.out.println(a & b);
//        System.out.println(Integer.toBinaryString(a & b));

//        System.out.println(a ^ b); // 0+0=0, 1+1=0, 1+0=1
//        System.out.println(Integer.toBinaryString(a ^ b));


        //Домашня робота: номеры шатлив

        int counter = 0;
        for (int i = 1; counter < 100; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9
            || i /100 == 4 || i / 100 == 9
            || i / 10 % 10 == 4 || i / 10 % 10 == 9)
            {
                continue;
            }
            System.out.println("shuttle number: " + i);
            counter++;
        }
            System.out.println(counter);

        System.out.println();
        System.out.println();

        // швыдкый спосиб

        int counter1 = 0;
        for (int i = 1; counter1 < 100; i++) {
            String stringNumber = String.valueOf(i);
            if (stringNumber.contains("4") || stringNumber.contains("9")) { // contains перевиряе наявнисть в рядку значень
                continue;
            }

            System.out.println("Shuttle umber " + i);
            counter1++;
        }
            System.out.println(counter1);








        // Вгадай чысло
        Scanner scanner = new Scanner(System.in);


        int playerNumber = 0;
        for (int j = 1; j <= 3; j++) {

            int computerNumber = (int) (Math.random() * 11);
            System.out.println(computerNumber);

            System.out.println("Enter your number from 1 to 10");

            if (scanner.hasNextInt()) {
                playerNumber = scanner.nextInt();
            } if (computerNumber == playerNumber) {
                System.out.println("You win");{
                    break;
                }
            } else {
                    System.out.println("You loose");
                    scanner.nextLine();
                }

            }


        }

    }




