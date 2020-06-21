import kyu8.DescendingOrder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(sortDesc(15550));
    }

    public static int sortDesc(final int num) {
        int[] digitsCount = new int[10]; //contains all digits from 0..9 to increment their count
        int number = num;
        while (number != 0) {
            int digit = number % 10;
            digitsCount[digit]++;
            number /= 10;
        }
        System.out.println(Arrays.toString(digitsCount));
        int result = 0;
        for (int digit = 9; digit >= 0; --digit) {
            int count = digitsCount[digit];
            for (int i = 0; i < count; ++i)
                result = result * 10 + digit;
        }
        return result;
    }

}
