package com.hillel.zaloga.homeworks.homework9;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //homework

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int m = 0;


        for (; ; ) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                System.out.println("you entered number: " + n);
            } else {
                System.out.println("Wrong value, try again!");
                scanner.nextLine();
                System.exit(0);
            }
        }










    }












}
