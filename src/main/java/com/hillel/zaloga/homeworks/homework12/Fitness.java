package com.hillel.zaloga.homeworks.homework12;

public class Fitness {

    private String name;
    public String surname;
    private int age;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String numberPhone;
    public int weight;
    public int pressure;
    public int steps;

    public Fitness(String name, String surname, int dayOfBirth, int monthOfBirth, int yearOfBirth,
                   String email, String numberPhone, int weight, int pressure, int steps) {
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.numberPhone = numberPhone;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    void printAccountInfo() {
        System.out.print(getName() + " ");
        System.out.print(getSurname() + ", ");
        System.out.print(getAge() + ", ");
        System.out.print(getDayOfBirth() + ".");
        System.out.print(getMonthOfBirth() + ".");
        System.out.print(getYearOfBirth() + ", ");
        System.out.print(getEmail() + ", ");
        System.out.print(getNumberPhone() + ", ");
        System.out.print(getWeight() + ", ");
        System.out.print(getPressure() + ", ");
        System.out.print(getSteps() + ", ");
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public int getAge() {
        this.age = 2020 - this.yearOfBirth;
        return age;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
