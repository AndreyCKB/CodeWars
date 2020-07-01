package kyu7;

//Count the number of divisors of a positive integer n.
//
//Random tests go up to n = 500000.
//
//Examples
//numberOfDivisors(4)  == 3 // 1, 2, 4
//numberOfDivisors(5)  == 2 // 1, 5
//numberOfDivisors(12) == 6 // 1, 2, 3, 4, 6, 12
//numberOfDivisors(30) == 8 // 1, 2, 3, 5, 6, 10, 15, 30

public class CountDivisorsNumber {

    public long numberOfDivisors(int n) {
        int count = 0;
        for (int divider = 1; divider < n + 1; divider++ ){
            if (n % divider == 0) {
                count++;
            }
    }
        return count;
    }

}
