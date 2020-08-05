package kyu5;
/*
Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :

 "(p1**n1)(p2**n2)...(pk**nk)"
with the p(i) in increasing order and n(i) empty if n(i) is 1.

Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
*/

// Buying a car,  Detect pangram, Prize draw, Simple encryption alternating split, Two sum, Primes in numbers
public class PrimesInNumbers {

    public static String factors(int n) {
        // your code
        if (n < 4) return "(" + n + ")";

        PrimesInNumbers storeNumbers = new  PrimesInNumbers();
        n = storeNumbers.check(n, 2);
        int maxDivider =(int) Math.sqrt(n);
        int count = 3;

        while (count < maxDivider){
            n = storeNumbers.check(n, count);
            ++count;
        }

        return n != 1 ? storeNumbers.result().append("("+ n +")").toString() : storeNumbers.result().toString();
    }

    private int[] primeDivisors = new int[20];
    private int[] countPrimeDivisors = new int[20];
    private int size = 0;

    private int check(int number, int divider){
          while (number % divider == 0){
              ++countPrimeDivisors[size];
              number /= divider;
          }
          if (countPrimeDivisors[size] != 0) {
              primeDivisors[size] = divider;
              size++;
          }
          return number;
    }

    private StringBuilder result(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++){
            if (countPrimeDivisors[i] > 1 ) {
                sb.append("(").append(primeDivisors[i]).append("**").append(countPrimeDivisors[i]).append(")");
            }else{
                sb.append("(").append(primeDivisors[i]).append(")");
            }
        }
        return sb;
    }
}
