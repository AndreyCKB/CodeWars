package kyu8;

import java.util.Arrays;

//Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
//
//Examples:
//Input: 21445 Output: 54421
//
//Input: 145263 Output: 654321
//
//Input: 123456789 Output: 987654321

public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        if (num > -10 && num < 10)
            return num;
        byte[] arr = intSplitToDigit(num);
        Arrays.sort(arr);
        return arrayByteToInt(arr);
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

    public static int arrayByteToInt(byte[] arr){
        int result = arr[ arr.length -1 ];
        for (int i = arr.length - 2; i > - 1; i-- ){
            result = result*10 + arr[i];
        }
        return result;
    }

}
