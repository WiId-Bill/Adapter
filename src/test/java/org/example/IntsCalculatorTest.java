package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntsCalculatorTest {
    Ints intTestCalc = new IntsCalculator();

    @Test
    void sum() {
        int actual = intTestCalc.sum(4,8);
        int expected = 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sub() {
        int actual = intTestCalc.sub(20,8);
        int expected = 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void mult() {
        int actual = intTestCalc.mult(4,8);
        int expected = 32;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void div() {
        int actual = intTestCalc.div(32,8);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void pow() {
        int actual = intTestCalc.pow(4,2);
        int expected = 16;
        Assertions.assertEquals(expected, actual);
    }

}