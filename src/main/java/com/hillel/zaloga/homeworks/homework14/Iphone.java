package com.hillel.zaloga.homeworks.homework14;

public class Iphone implements Smartphones, LinuxOS, IOS{


    @Override
    public void getOperationSystem() {
        IOS.super.getOperationSystem();
    }

    @Override
    public void call() {
        System.out.println("call iphone");

    }

    @Override
    public void sms() {
        System.out.println("sms iphone");

    }

    @Override
    public void internet() {
        System.out.println("internet iphone");

    }





}
