package com.hillel.zaloga.homeworks.homework14;

public interface LinuxOS {

    default void getOperationSystem() {
        System.out.println("I am working on Linux");
    }
}
