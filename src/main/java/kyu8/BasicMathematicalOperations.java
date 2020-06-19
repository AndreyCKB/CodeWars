package kyu8;
//Your task is to create a function that does four basic mathematical operations.
//
//The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation.
//
//Examples
//basicOp('+', 4, 7)         // Output: 11
//basicOp('-', 15, 18)       // Output: -3
//basicOp('*', 5, 5)         // Output: 25
//basicOp('/', 49, 7)        // Output: 7
public class BasicMathematicalOperations {

    public static Integer basicMath(String op, int v1, int v2) throws ArithmeticException
    {
        Integer result = 0;
        switch (op) {
            case ("+"):result = v1 + v2; break;
            case ("-"):result = v1 - v2; break;
            case ("/"):result = v1 / v2; break;
            case ("*"):result = v1 * v2; break;
        }
        return result;
    }
}
