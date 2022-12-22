package com.hillel.zaloga.homeworks.homework11;

public class Burger {

    String bun;
    String meat;
    String doubleMeet;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("burgerWithAll " + this);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("burgerDiet " + this);
    }

    public Burger(String bun, String meat, String doubleMeet, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.doubleMeet = doubleMeet;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("doubleMeet " + this);
    }


    @Override
    public String toString() {
        return "складники: " +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", doubleMeet='" + doubleMeet + '\'' +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'' +
                ", mayonnaise='" + mayonnaise + '\'';
    }
}
