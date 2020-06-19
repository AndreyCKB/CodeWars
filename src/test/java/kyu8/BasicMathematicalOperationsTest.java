package kyu8;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


class BasicMathematicalOperationsTest {
    BasicMathematicalOperations basicOps = new BasicMathematicalOperations();

    @Test
    public void testBasics()
    {
        System.out.println("Basic Tests");
        assertThat( basicOps.basicMath("+", 4, 7), is(11) );
        assertThat( basicOps.basicMath("-", 15, 18), is(-3) );
        assertThat( basicOps.basicMath("*", 5, 5), is(25) );
        assertThat( basicOps.basicMath("/", 49, 7), is(7) );
        assertThrows(ArithmeticException.class
                     ,() -> basicOps.basicMath("/", 49
                     , 0), "Division by zero is prohibited");
    }
}