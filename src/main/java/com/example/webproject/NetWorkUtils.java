package com.example.webproject;

public class NetWorkUtils {
    public  static  void getConnect(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
