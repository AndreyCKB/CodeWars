package kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesInNumbersTest {
    @Test
    public void testPrimeDecompOne() {
        int lst = 7775460;
        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)",
                PrimesInNumbers.factors(lst));
    }

    @Test
    public void testPrimeDecompTwo() {
        int lst = 47230577;
        assertEquals(
                "(31)(1523567)",
                PrimesInNumbers.factors(lst));
    }
}