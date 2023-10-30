package com.example.j_unit;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest {
    @Test
    public void testAddition() {
        operasi_matematika math = new operasi_matematika();
        int result = math.add(7, 6);
        assertEquals(13, result);
    }
}