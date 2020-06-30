package kyu6;
//Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n^3,
//  the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.
//
//You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?
//
//The parameter of the function findNb (find_nb, find-nb, findNb) will be an integer m and you have to return
//  the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
//
//Examples:
//findNb(1071225) --> 45
//findNb(91716553919377) --> -1
//mov rdi, 1071225
//call find_nb            ; rax <-- 45
//
//mov rdi, 91716553919377
//call find_nb            ; rax <-- -1
public class BuildPileOfCubes {
//    private static long[] numberPow3 = new long[5000];

    public static long findNb(long m) {
        // your code
        if (m == 1) return 1;
        long count = 1;
        int start = 0;
        long result = 0;
        int nextStep = start;
        long max = (int) Math.pow(m, 1.0 / 3);
        while (start < max){
            System.out.println(result + "      " + max + "    " + start + "     " + count);
            while (result < m && result > -1){
                result += nextStep * nextStep * nextStep;
                if (result == m) return count;
                count++;
                nextStep++;
            }
        System.out.println(result + "      " +  start + "     " + count);
        result =0;
        count = 1;
        nextStep = ++start;
        }
        return -1;
    }

}
