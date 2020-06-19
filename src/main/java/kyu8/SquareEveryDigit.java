package kyu8;

//Welcome. In this kata, you are asked to square every digit of a number.
//
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//Note: The function accepts an integer and returns an integer

public class SquareEveryDigit {

    public int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();
        int sqr;
        while (n >0) {
            sqr = n % 10;
            sqr *= sqr;
            sb.insert(0, sqr);
            n /= 10;
        }
        return Integer.parseInt(sb.toString());
    }


}
