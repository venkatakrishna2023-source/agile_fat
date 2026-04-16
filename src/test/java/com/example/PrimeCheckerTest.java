package com.example;

import org.junit.Test;
import static org.junit.Assert.*; 

public class PrimeCheckerTest {
    @Test
    public void testPrime() {
        assertTrue(PrimeChecker.isPrime(7));
        assertFalse(PrimeChecker.isPrime(4));
    }
}