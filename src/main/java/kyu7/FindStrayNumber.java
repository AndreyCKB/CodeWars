package kyu7;
//You are given an odd-length array of integers, in which all of them are the same, except for one single number.
//
//Complete the method which accepts such an array, and returns that single different number.
//
//The input array will always be valid! (odd-length >= 3)
//
//Examples
//[1, 1, 2] ==> 2
//[17, 17, 3, 17, 17, 17, 17] ==> 3

public class FindStrayNumber {
    static int stray(int[] numbers) {
        int checkValue = numbers[0];
        int result = 1;
        for (; result < numbers.length; result++) {
            if (checkValue != numbers[result]) break;
        }
        if (result < 2  ) {
            result = checkValue != numbers[2] ? 0 : 1;
        }
        return numbers[result];
    }
}
