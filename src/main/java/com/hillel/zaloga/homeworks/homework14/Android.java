package com.hillel.zaloga.homeworks.homework14;

public class Android implements Smartphones, LinuxOS, IOS{


    @Override
    public void call() {
        System.out.println("call android");

    }

    @Override
    public void sms() {
        System.out.println("sms android");

    }

    @Override
    public void internet() {
        System.out.println("internet android");

    }

    @Override
    public void getOperationSystem() {
        LinuxOS.super.getOperationSystem();
    }
}
