package com.hillel.zaloga.homeworks.homework14;

public interface IOS {

    default void getOperationSystem() {
        System.out.println("I am working on iOS");
    }
}
