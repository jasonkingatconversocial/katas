package com.conversocial.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void test1() {
        assertEquals("I", RomanNumerals.convert(1) );
    }

}
