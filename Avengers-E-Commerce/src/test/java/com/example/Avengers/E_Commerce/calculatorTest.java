package com.example.Avengers.E_Commerce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class calculatorTest {


    Calculation calculation=new Calculation();

    @Test
    public void positiveNumberTestThenOutputWillBePositive(){

        int a=10;
        int b=25;
        int expected=35;
        int actual= calculation.add(a,b);
        Assertions.assertEquals(expected,actual);

    }
}
