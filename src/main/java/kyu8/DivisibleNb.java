package kyu8;

public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        // your code
        return ( n % x == 0 ) && ( n % y == 0 );
    }
}
