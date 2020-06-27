package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.
//
//In effect: 89 = 8^1 + 9^2
//
//The next number in having this property is 135.
//
//See this property again: 135 = 1^1 + 3^2 + 5^3
//
//We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.
//
//Let's see some cases:
//
//sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]
//
//sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
//If there are no numbers of this kind in the range [a, b] the function should output an empty list.
//
//sum_dig_pow(90, 100) == []
//Enjoy it!!

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List<Long> result = new ArrayList<>(50);
        for (long i = a; a < b ; a++){
            if (a < 10) {
                result.add(a);
            } else {
                long l = sumDig(intSplitToDigit(a), a);

                if (l != -1 && a == l) result.add(l);
            }
        }
        return  result;
    }

    private static byte[] intSplitToDigit(long number){
        int count = 0;
        byte[] result = new byte[20];
        while (number > 0){
            result[ count ] =(byte) (number % 10);
            number /= 10;
            ++count;
        }
        return Arrays.copyOf(result, count);
    }

    public static long sumDig(byte[] arr, long maxValue){
        int pov = 1;
        long result = (long) Math.pow(arr[arr.length - 1], pov);
        for (int i = arr.length-2; i >-1; i--){
            result += (long) Math.pow(arr[i], ++pov);
            if (result > maxValue) return -1;
        }
        return result;
    }

}
