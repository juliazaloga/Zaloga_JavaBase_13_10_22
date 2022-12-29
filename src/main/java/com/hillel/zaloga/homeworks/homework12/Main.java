package com.hillel.zaloga.homeworks.homework12;

public class Main {
    public static void main(String[] args) {

        Fitness person1 = new Fitness("Kim", "KKK", 23, 9, 1990,
                "kkk@gmail.com", "85637450", 55, 120, 5000);

        Fitness person2 = new Fitness("Den", "DDD", 13, 6, 1985,
                "euwgh@gmail.com", "638596720", 90, 125, 7000);

        Fitness person3 = new Fitness("Chloe", "HHH", 28, 4, 1993,
                "ierhgei@gmail.com", "683057264", 50, 110, 5786);

        person1.printAccountInfo();
        System.out.println();
        System.out.println();

        person2.printAccountInfo();
        System.out.println();
        System.out.println();

        person3.printAccountInfo();
        System.out.println();
        System.out.println();

        person1.steps = 6500;
        person2.setNumberPhone("57888889");

        System.out.println();

        person1.printAccountInfo();
        System.out.println();
        person2.printAccountInfo();









    }
}
