package com.example.webproject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class NetWorkUtilsTest {

    @Test
    @Timeout(value = 1001,unit = TimeUnit.MILLISECONDS)
    void getConnect() {
        NetWorkUtils.getConnect();
    }
}