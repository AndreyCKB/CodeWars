package kyu6;
//Write Number in Expanded Form
//You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//Kata.expandedForm(12); # Should return "10 + 2"
//Kata.expandedForm(42); # Should return "40 + 2"
//Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
//NOTE: All numbers will be whole numbers greater than 0.

import java.util.Arrays;

public class WriteNumberInExpandedForm {

    public static String expandedForm(int num)
    {
        //your code here
        if (num <= 10) return String.valueOf(num);
        StringBuilder result = new StringBuilder();
        byte[] bytes = intSplitToDigit(num);
        for (int i = bytes.length-1; i > -1; i--){
            if (bytes[i] > 0) {
                result.append((int) (bytes[i]*Math.pow(10,i) ))
                      .append(" + ");
            }
        }

        return result.delete(result.length() - 3, result.length())
                .toString();
    }

    public static byte[] intSplitToDigit(int number){
        byte count = 0;
        byte[] result = new byte[10];
        while (number > 0){
            result[ count ] = (byte) (number % 10);
            number /= 10;
            ++count;
        }
        return Arrays.copyOf(result, count);
    }
}
