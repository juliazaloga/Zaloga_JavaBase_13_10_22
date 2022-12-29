package com.hillel.zaloga.homeworks.homework14;

public class MainHomework {
    public static void main(String[] args) {

        Android android = new Android();
        android.call();
        android.sms();
        android.internet();
        android.getOperationSystem();

        System.out.println();

        Iphone iphone = new Iphone();
        iphone.call();
        iphone.sms();
        iphone.internet();
        iphone.getOperationSystem();

    }
}
