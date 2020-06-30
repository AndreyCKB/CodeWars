package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WriteNumberInExpandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("2", WriteNumberInExpandedForm.expandedForm(2));
        assertEquals("10", WriteNumberInExpandedForm.expandedForm(10));
        assertEquals("10 + 2", WriteNumberInExpandedForm.expandedForm(12));
        assertEquals("40 + 2", WriteNumberInExpandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", WriteNumberInExpandedForm.expandedForm(70304));
        assertEquals("100000 + 70000 + 300 + 4", WriteNumberInExpandedForm.expandedForm(170304));
    }
}