package main.java;

/*
Problem statement:
        In the problem ” Plus One”  we are given an array where each element in the array represents a digit of a number.
        The complete array represents a number. The zeroth index represents the MSB of the number.
        We can assume that there is no leading zero in the number.
        Our task is to plus one the given number and then return the result in the form of an array.
*/

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] arr= {9,9,9,9};
        System.out.println("Input: "+ Arrays.toString(arr));
        System.out.println("Output: "+ Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++; return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
    }


/*  public static int[] plusOne(int[] arr) {
        int[] plusOneArr;
        int len=arr.length;
        int i;
        for(i=len-1;i>=0;i--) {
              if (arr[i]<9) {
                arr[i] = arr[i] + 1;
                break;
              }
                arr[i] = 0;
        }

            if(arr[0]==9)
                plusOneArr= new int[len+1];
            else
                plusOneArr= new int[len];

            int x=plusOneArr.length;

            for(int j=len-1;j>=0;j--) {
                if (x == len)
                    plusOneArr[j] = arr[j];
                else {
                    plusOneArr[j + 1] = arr[j];
                    plusOneArr[0] = 1;
                }
            }
        return plusOneArr;
    }
*/


}
