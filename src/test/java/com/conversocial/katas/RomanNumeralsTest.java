package com.conversocial.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void testI() {
        assertEquals("I", RomanNumerals.convert(1) );
    }

    @Test
    public void testVII() {
        assertEquals("VII", RomanNumerals.convert(7) );
    }

    @Test
    public void testX() {
        assertEquals("X", RomanNumerals.convert(10) );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnknownNumber() {
        RomanNumerals.convert(0);
    }

}