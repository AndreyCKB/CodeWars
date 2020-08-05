package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyingACarTest {
    @Test
    public void test1() {
        int[] r = new int[] { 6, 766 };
        assertArrayEquals(r, BuyingACar.nbMonths(2000, 8000, 1000, 1.5));
    }
    @Test
    public void test2() {
        int[] r = new int[] { 0, 4000 };
        assertArrayEquals(r, BuyingACar.nbMonths(12000, 8000, 1000, 1.5));
    }
}