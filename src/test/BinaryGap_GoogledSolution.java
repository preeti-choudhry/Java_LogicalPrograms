package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BinaryGap_GoogledSolution {static String N_binary;
    static int count, result, answer, x;
    static boolean inGap;
    static boolean hasOne;

    public static int solution(int N)
    {
// write your code in C# 6.0 with .NET 4.5 (Mono)



        count = 0;
        result = 0;
        inGap = false;
        hasOne = false;

        while (N > 0)
        {
            if ((N & 1) == 1)
            {
                if (inGap)
                {
                    result = Math.max(result, count);
                    count = 0;
                    inGap = false;
                }

                hasOne = true;
            }
            else
            {
                if (hasOne && !inGap) inGap = true;
                if (inGap) count++;
            }

            N >>= 1;
        }

        return result;

    }


    public static void main(String args[]) {

        File inputFile = new File("test-input.txt");
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            x = Integer.parseInt(reader.readLine());
            answer = solution(x);
            System.out.println(x +" "+answer);

        }   catch(IOException e) { }

        //test.BinaryGap.Solution(20);

    }


}
