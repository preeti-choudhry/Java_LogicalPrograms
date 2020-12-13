package main.java;

public class Factorial {

    public static void printFactorial(int n)
    {
        int factorial=1;
        for(int i=n;i>0;i--)
            factorial=factorial*i;

        System.out.println(factorial);

    }

    public static void main(String[] args)
    {
        printFactorial(5);
    }
}
