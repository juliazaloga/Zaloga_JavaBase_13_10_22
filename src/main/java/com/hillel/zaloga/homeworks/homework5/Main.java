package com.hillel.zaloga.homeworks.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //домашня робота

        // Перша команда
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the first team");
        String firstTeam = scanner.nextLine();

        System.out.println("Enter frags of first player");
        int fragsPlayer1t1 = 0;
        if (scanner.hasNextInt()) {
            fragsPlayer1t1 = scanner.nextInt();
        } else {
            System.out.println("Wrong value, try again!");
            System.exit(0);
        }

        System.out.println("Enter frags of second player");
        int fragsPlayer2t1 = 0;
        if (scanner.hasNextInt()) {
            fragsPlayer2t1 = scanner.nextInt();
        } else {
            System.out.println("Wrong value, try again!");
            System.exit(0);
        }

        System.out.println("Enter frags of third player");
        int fragsPlayer3t1 = 0;
        if (scanner.hasNextInt()) {
            fragsPlayer3t1 = scanner.nextInt();
        } else {
            System.out.println("Wrong value, try again!");
            System.exit(0);
        }

        System.out.println("Enter frags of fourth player");
        int fragsPlayer4t1 = 0;
        if (scanner.hasNextInt()) {
            fragsPlayer4t1 = scanner.nextInt();
        } else {
            System.out.println("Wrong value, try again!");
            System.exit(0);
        }

        System.out.println("Enter frags of fifth player");
        int fragsPlayer5t1 = 0;
        if (scanner.hasNextInt()) {
            fragsPlayer5t1 = scanner.nextInt();
        } else {
            System.out.println("Wrong value, try again!");
            System.exit(0);
        }
        scanner.nextLine();


        // Друга команда
        System.out.println("Enter the name of the second team");
        String secondTeam = scanner.nextLine();
        System.out.println("name:" + secondTeam);

        System.out.println("Enter frags of first player");
        int fragsPlayer1t2 = 0;
        if (scanner.hasNextInt()) {
            fragsPlayer1t2 = scanner.nextInt();
        } else {
            System.out.println("Wrong value, try again!");
            System.exit(0);
        }

        System.out.println("Enter frags of second player");
        int fragsPlayer2t2 = 0;
        if (scanner.hasNextInt()) {
            fragsPlayer2t2 = scanner.nextInt();
        } else {
            System.out.println("Wrong value, try again!");
            System.exit(0);
        }

        System.out.println("Enter frags of third player");
        int fragsPlayer3t2 = 0;
        if (scanner.hasNextInt()) {
            fragsPlayer3t2 = scanner.nextInt();
        } else {
            System.out.println("Wrong value, try again!");
            System.exit(0);
        }

        System.out.println("Enter frags of fourth player");
        int fragsPlayer4t2 = 0;
        if (scanner.hasNextInt()) {
            fragsPlayer4t2 = scanner.nextInt();
        } else {
            System.out.println("Wrong value, try again!");
            System.exit(0);
        }

        System.out.println("Enter frags of fifth player");
        int fragsPlayer5t2 = 0;
        if (scanner.hasNextInt()) {
            fragsPlayer5t2 = scanner.nextInt();
        } else {
            System.out.println("Wrong value, try again!");
            System.exit(0);
        }
        scanner.nextLine();

        //Пидрахунок
        int arithmeticMeanTeam1 = (fragsPlayer1t1 + fragsPlayer2t1 + fragsPlayer3t1
                + fragsPlayer4t1 + fragsPlayer5t1) / 5;

        int arithmeticMeanTeam2 = (fragsPlayer1t2 + fragsPlayer2t2 + fragsPlayer3t2
                + fragsPlayer4t2 + fragsPlayer5t2) / 5;


        if (arithmeticMeanTeam1 > arithmeticMeanTeam2) {
            System.out.println("Перемогла команда: " + firstTeam + " набрала: " + arithmeticMeanTeam1 + " очків");
        } else if (arithmeticMeanTeam1 < arithmeticMeanTeam2) {
            System.out.println("Перемогла команда: " + secondTeam + " набрала: " + arithmeticMeanTeam2 + " очків");
        } else {
            System.out.println("Draw");
        }


    }




    static void scanner() {
        Scanner scanner = new Scanner(System.in);

//        String next = scanner.next(); //зчитуэ одне перше нерозрывне слово/ прымитывный тып данных
//        System.out.println("next: " + next);
//
//        String nextLine = scanner.nextLine(); // зчитуэ весь рядок до \н(ентер)/референсный тып данных
//        System.out.println("nextLine: " + nextLine);

//        int number = scanner.nextInt(); //для прымитывного тыпу данных лыше числа,або буде помылка
//        System.out.println(number);

//        System.out.println("please enter integer number");
//        if (scanner.hasNextInt()) {  //wей метод повертаэ фолс(неправда) якщо введено не лыше чысла або некорректно
//            int number = scanner.nextInt();
//            System.out.println(number);
//        } else {
//            System.out.println("wrong data restart application"); //повидомлення для корыстувача якщо введено не правыльно
//            System.exit(0); //завершуэ роботу программы
//        }

//        System.out.println("Please enter your age");
//        int age = scanner.nextInt(); // залишаэться писля \н який вин покладе в слидуючу зминну або обьэкт
//        scanner.nextLine(); // зачистка буферу, сюды зчытаэ \н якый залышывся
//
//        System.out.println("Please enter your name");
//        String name = scanner.nextLine();
//
//        System.out.println("age = " + age);
//        System.out.println("name = " + name);





    }
    static void thirdPart () {
//        int a = 10;
//        int b = 20;

//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <=b");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b){  //такых перевирок може буты скилькы завгодно, якщо нема елс а вси перевиркы фолс, ничого запущено не буде
//            System.out.println("a < b");}
//            else {  // якщо вижче перевирка не пройшла то елс робыть дию в любому выпадк без перевиркы
//                System.out.println("a == b");
//            }


//        if (a >= b) {
//            System.out.println("a >= b");} // якщо пеше значення пройшло, то все инше запущено не буде
//            if (a > b) {
//                System.out.println("a < b");
//            } else {
//                System.out.println("a == b");
//            }

//        if (a >= b) {
//            System.out.println("a >= b");
//            if (a == b) {
//                System.out.println("a == b");
//        } else {
//            System.out.println("a >= b");
//        }}

//        if (a < b) {
//            System.out.println("YES");
//        } else {
//            System.out.println("no");
//        }

//        // умова ? вираз 1 : (: инкаше) выраз 2 |
//        System.out.println((a < b) ? "yes" : "no");


//        if (a <= b) {
//            if (a < b) {
//                System.out.println("a < b");
//            }
//         else {
//            System.out.println("a == b");}
//        } else {
//            System.out.println("no");
//        }
//
//        //трынарный оператор(те саме що конструкция выще)
//        System.out.println(
//                (a <= b) ?
//                        (a < b) ?
//                                "a < b"
//                                : "a == b"
//                        : "no"
//        );
//
//
//        if (10 > 20) {
//            System.out.println("1");
//            System.out.println("2");
//            System.out.println("3");
//        }

//         int a = 11;

//         if (a == 1) {
//             System.out.println("a =1");
//         } else if (a == 2) {
//             System.out.println("a =2");
//         } else if (a == 3) {
//             System.out.println("a =3");
//         } else if (a == 2) {
//             System.out.println("a =4");
//         }

//         switch (a) {
//             case 1 : {
//                 System.out.println("1");
//                 break;
//             }
//             case 2 : {
//                 System.out.println("2");
//                 break;
//             }
//             case 3 : {
//                 System.out.println("3");
//                 break;
//             }
//             case 4 : {
//                 System.out.println("4");
//                 break;
//             }
//             default: {
//                 System.out.println("default");
//                 break;
//             }
//
//         }

//        String str = "AAA";
//
//        switch (str) {
//            case "CCC": {
//                System.out.println("ccc");
//                break;
//            }
//            case "AAA": {
//                System.out.println("aaa");
//                break;
//            }
//            case "BBB": {
//                System.out.println("bbb");
//                break;
//            }
//
//        }



    }
//

         static void secondPat () {
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int d = 40;


//        System.out.println((a < b) && (b > c)); //and
//        System.out.println((a > b) || (b > c)); // or
//        System.out.println();
//
//        System.out.println((a > b) || (b > c) || (c < d));

//        System.out.println();
//        System.out.println();
//
//        System.out.println("b = " + b);
//        System.out.println((a > b) || (++b > c));
//        System.out.println("b = " + b);

        //-----------------------------------------------------------//

//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int d = 40;
//        System.out.println((a > b) && (c > d) || (c < d)); // true
//        System.out.println((30 < 20) && ((20 > 10) || (30 < 40) && (20 > 10))); //частина в дужках не запуститься бо &&
//
//
    }


    static void part1() {
        int a = 10;
        int b = 20;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        System.out.println();
        System.out.println();

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2); // поривнюэ посилання в памяти (значення)
        System.out.println(str1 == str3);
        System.out.println();

        System.out.println(str1.equals(str2)); // привнюэ саме значення
        System.out.println(str1.equals(str3));

        System.out.println();

        System.out.println(a != b);

        System.out.println();

        boolean someBooleanVariable = false;
        System.out.println(someBooleanVariable);
        System.out.println(!someBooleanVariable);

        System.out.println();








    }


}
