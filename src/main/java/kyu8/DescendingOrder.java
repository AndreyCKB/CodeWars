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
        if (num > -10 && num < 10) return num;
        byte[] arr = intSplitToDigit(num);
        sortArrayByte(arr);
        return arrayByteToInt(arr);
    }
    public static byte[] intSplitToDigit(int number){
        byte count = 0;
        byte[] result =new byte[11];
        while (number >= 1){
            result[ count ] = (byte) (number % 10);
            number /= 10;
            ++count;
        }
        result[ 10 ] = count;
        return result;
    }

    public static void sortArrayByte(byte[] arr){
        byte endIndex = arr[ arr.length - 1 ];
        if ( endIndex  <= 1) return;
        byte curentIndex = 1;
        byte tempIndex = curentIndex;
        byte temp = 0;
        while (curentIndex < endIndex){
            if (arr[ tempIndex ] > arr[ tempIndex -1 ]){
                temp = arr[ tempIndex ];
                arr[ tempIndex ] = arr [ tempIndex -1 ];
                arr[ tempIndex - 1 ] = temp;
                if (tempIndex != 1) tempIndex--;
            } else {
                tempIndex = ++curentIndex;
            }
        }
    }

    public static int arrayByteToInt(byte[] arr){
        byte length = arr[ arr.length - 1 ];
        if ( length  <= 1) return arr[ 0 ];
        int multiplier = 1;
        int result = 0;
        for (int i = --length; i > -1; i--){
            if(arr[ i ] != 0){
                result += arr[i] * multiplier;
            }
            multiplier *= 10;
        }
        return result;
    }

}
