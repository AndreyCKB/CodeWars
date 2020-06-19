package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareEveryDigitTest {

    @Test
    public void test() {
        assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
        assertEquals(25166481, new SquareEveryDigit().squareDigits(5489));
    }
}