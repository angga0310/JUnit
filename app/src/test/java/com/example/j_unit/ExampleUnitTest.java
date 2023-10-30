package com.example.j_unit;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest {

    //melakukan eksekusi dari method yang dibuat
    //jika hasil yang dimasukan benar maka hasil akan benar dan jika salah maka hasil akan salah
    @Test
    public void testAddition() {
        operasi_matematika math = new operasi_matematika();
        int result = math.add(7, 6);
        assertEquals(13, result);
    }
}