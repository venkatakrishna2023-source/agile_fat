package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckerTest {
    @Test
    public void testPrime() {
        assertTrue(PrimeChecker.isPrime(7));
        assertFalse(PrimeChecker.isPrime(4));
    }
}