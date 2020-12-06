/*
Mary has N (even number) number of candies. There's variety of candies( but not all different, there can be 1 or more candies of same type).
Mary's Parents have asked her to share half of candies with her brother. Mary like to have a variety so she would have N/2 candies but with as much variety as possible.
For eg. if each integer in array  T (T[]) represents a candy, and if int[] T= [3,4,7,7,6,6] then Mary would like to have a combination from the variety 3, 4, 7 & 6.
But Mary can keep only 3 candies in this example.
Write a program so Mary can pick N/2 candies with as much variety.
The program should be able to return the number of variety of candies she got, i.e how many different types of candies she got after giving half to her brother.

 */

package main.java;

import java.util.HashSet;

public class CodilityCandyProblem {

    public int solution(int[] T)
    {
        HashSet<Integer> candies = new HashSet<>();
        int totalCandies= T.length;
        for(int i=0;i<totalCandies;i++)
        {
            candies.add(T[i]);
            // System.out.println(candies.toString());
            if(candies.size()==totalCandies/2)
            {
                break;
            }
        }

        System.out.println(candies.toString());
        return candies.size();
    }

    public static void main(String args[])
    {
        CodilityCandyProblem s = new CodilityCandyProblem();
        int[] X = {3,4,7,7,6,6};
        System.out.println(s.solution(X));

    }
}


