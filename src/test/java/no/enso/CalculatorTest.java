package no.enso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void totalAllMultiples() {
        assertEquals(Calculator.totalAllMultiples(0), 0);
        assertEquals(Calculator.totalAllMultiples(10), 23);
        assertEquals(Calculator.totalAllMultiples(20), 78);
    }

    @Test
    public void test_isMultipleOfThreeOrFive_true() {
        assertTrue(Calculator.isMultipleOfThreeOrFive(3));
        assertTrue(Calculator.isMultipleOfThreeOrFive(5));
        assertTrue(Calculator.isMultipleOfThreeOrFive(6));
        assertTrue(Calculator.isMultipleOfThreeOrFive(15));
    }

    @Test
    public void isMultipleOfThreeOrFive_false() {
        assertFalse(Calculator.isMultipleOfThreeOrFive(0));
        assertFalse(Calculator.isMultipleOfThreeOrFive(16));
    }

}
