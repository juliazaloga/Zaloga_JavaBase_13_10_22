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


        System.out.println("Name: " + name + ", surname: " + surname + ", age: " + getAge() + ", birth: " + dayOfBirth
                + "." + monthOfBirth + "." + yearOfBirth + ", email: " + email + ", phone number: " + numberPhone
                + ", weight: " + weight + ", pressure: " + pressure + ", steps: " + steps);

    }

    public int getAge() {
        this.age = 2020 - this.yearOfBirth;
        return age;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
