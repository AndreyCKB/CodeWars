package kyu8;

import java.util.Arrays;
import java.util.List;

//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//
//Example:
//
//highAndLow("1 2 3 4 5")  // return "5 1"
//highAndLow("1 2 -3 4 5") // return "5 -3"
//highAndLow("1 9 3 4 -5") // return "9 -5"
//Notes:
//
//All numbers are valid Int32, no need to validate them.
//There will always be at least one number in the input string.
//Output string must be two numbers separated by a single space, and highest number is first.
public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        // Code here
        int min,max;

        String[] number = numbers.split(" ");
        min = max = Integer.parseInt(number[0]);

        for (int i = 1; i < number.length; i++) {
            int n = Integer.parseInt(number[i]);
            if (n < min) min = n;
            if (n > max) max = n;
        }


        return "" + max + " " + min;
    }

}
