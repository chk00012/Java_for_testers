package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo() {

        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }
    @Test
    public void canAddTwoPlusZero() {
        int answer  = 2 - 2;
        assertEquals("2-2=0", 0, answer);
    }
    @Test
    public void canFourDividedByTwo() {
        int answer = 4/2;
        assertEquals("4/2=2", 2, answer);
    }

    @Test
    public void integerFour() {
        Integer four = new Integer(4);
        assertEquals("4 is returned",4, four.intValue());
    }

    @Test
    public void hexint1() {
        Integer hex = 11;
        assertEquals("that 11 becomes b","b", hex.toHexString(hex));
    }
    @Test
    public void hexint2() {
        Integer hex = 10;
        assertEquals("that 10 becomes a", "a", hex.toHexString(hex));
    }
    @Test
    public void hexint3() {
        Integer hex = 3;
        assertEquals("that 3 becomes 3", "3", hex.toHexString(hex));
    }
    @Test
    public void hexint4() {
        Integer hex = 21;
        assertEquals("that 21 becomes 15", "15", hex.toHexString(hex));
    }

    @Test
    public void maxValue() {
        Integer max = 2147483647 ;
        assertEquals(2147483647, max.MAX_VALUE);
    }
    @Test
    public void minValue() {
        Integer min = -2147483648 ;
        assertEquals(-2147483648, min.MIN_VALUE);
    }


}



