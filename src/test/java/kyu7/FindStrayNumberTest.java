package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class FindStrayNumberTest {
    @Test
    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
        assertEquals(3, getActualFor(17, 17, 3, 17, 17, 17, 17));
        assertEquals(3, getActualFor(3, 17, 17, 17, 17, 17, 17));
        assertEquals(3, getActualFor(17, 17, 17, 17, 17, 17, 3));

    }

    private int getActualFor(int... numbers) {
        return FindStrayNumber.stray(numbers);
    }
}