package kyu7;
//You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.
//
//Find max(abs(length(x) − length(y)))
//
//If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
//
//#Example:
//
//a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
//a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
//mxdiflg(a1, a2) --> 13
//Bash note:
//input : 2 strings with substrings separated by ,
//output: number as a string
public class MaximumLengthDifference {

    public static int mxdiflg(String[] a1, String[] a2) {
        // your code
        if (a1.length == 0 || a2.length ==0) return -1;
        int[] a1MinMax = maxAndMinlLengthSting(a1);
        int[] a2MinMax = maxAndMinlLengthSting(a2);
        return a2MinMax[1] - a1MinMax[0] < a1MinMax[1] - a2MinMax[0] ? a1MinMax[1] - a2MinMax[0] : a2MinMax[1] - a1MinMax[0];
    }

    private static int[] maxAndMinlLengthSting(String[] strs){
        int temp;
        int[] result = new int[2];
        result[0] = result[1] = strs[0].length();

        for(int i = 1; i < strs.length; i++){
            temp = strs[i].length();
            if (temp < result[0])
                result[0] = temp;
            else if (temp > result[1])
                result[1] = temp;
        }
        return result;
    }

}
