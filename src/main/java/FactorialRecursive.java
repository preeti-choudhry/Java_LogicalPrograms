package main.java;

public class FactorialRecursive {

    public static int fact=1;
    public static int factorial(int n)
    {
        if (n==0 || n==1)
            return fact;

        fact = fact * n * factorial(n - 1);
        return fact;

    }

    public static void main(String[] args)
    {
        int factorial= factorial(5);
        System.out.println(factorial);
    }
}
