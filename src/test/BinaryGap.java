package test;/*
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
Write a function:
class Solution { public int solution(int N); }
that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..2,147,483,647].
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalInt;

public class BinaryGap {

    public static OptionalInt answer;
    public static int count;
    public static int len;
    public static int i;
    public static int j;
    public static int N;
    public static String binaryVal = "";

    public static OptionalInt solution(int Num) {
        N = Num;
        while (N > 0) {

            int remainder = N % 2;
            //String r = (String) remainder;
            binaryVal = new StringBuilder().append(remainder).append(binaryVal).toString();
            N = N / 2;
        }

        int[] allBinaryGaps = new int[0];
        int n = 0;
        count = 0;
        len = binaryVal.length();
        ;
        for (i = 0; i < len; i++) {

            if (binaryVal.charAt(i) == 1) {
                j = i + 1;

                //for (int j=i+1; i<binaryVal.length;j++) {
                while (j < len && binaryVal.charAt(j) == 0) {
                    count++;
                    j++;
                }
                allBinaryGaps[n++] = count;
                count = 0;
                System.out.println("Number " + Num + " has BinaryValue=" + binaryVal + " and has test.BinaryGap=" + count);

            }
        }



/*      int maxcount=0;
            for (int k=0;k<allBinaryGaps.length; k++)
            {
                if (allBinaryGaps[k] > maxcount )
                    maxcount= allBinaryGaps[k];
            }
*/
        OptionalInt maxcount;
        maxcount = Arrays.stream(allBinaryGaps).max();
        return maxcount;

    }


    public static void main(String args[]) {
    /*
        //List<Integer>
        int[] Nvalues = {1, 2,147,483,647};
        HashMap<Integer,String> Nbools = new HashMap<>();

        for (i=0;i<Nvalues.length;i++) {
            String binaryVal = "";
            int num = Nvalues[i];
            while(num>0)
            {

                int remainder = num%2;
                binaryVal = remainder + binaryVal;
                num=num/2;
            }
            Nbools.put(Nvalues[i],binaryVal);
        }

        HashMap<Integer,Integer> binaryGaps = new HashMap<>();
        for (i=0;i<Nbools.size();i++) {
            int binaryGap;
            for (String s :  Nbools.values() ) {
                 //Logic for calculating test.BinaryGap follows-
                s.
            }
        } */

        //test.BinaryGap bg = new test.BinaryGap();


        File inputFile = new File("resources/test-input.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            int x = Integer.parseInt(reader.readLine());
            answer = solution(x);
            System.out.println(x + " " + answer);

        } catch (IOException e) {
        }

        BinaryGap.solution(20);


    }

}



