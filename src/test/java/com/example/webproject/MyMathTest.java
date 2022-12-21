package com.example.webproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void shouldThrtowExceptionIdDividedByZero() {
        // action
//        MyMath myMath = new MyMath();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            MyMath.divide(5, 0);
        });
    }
}