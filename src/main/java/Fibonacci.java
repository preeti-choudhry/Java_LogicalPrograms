package main.java;

public class Fibonacci {

    public static int[] fibonacci;
    public static int i,first,second,third;
    public static int[] returnFibonacci(int n)
    {
        fibonacci= new int[n];
        i=0;
        first= i;
        second= i+1;
        fibonacci[first]=0;
        fibonacci[second]=1;

        while(i<n-2)
        {
            third = i+2;
            fibonacci[third]=fibonacci[first]+fibonacci[second];
            first=second;
            second=third;
            i++;
        }

        return fibonacci;
    }

    public static int returnNthInFibonacci(int n)
    {
        int [] fib=returnFibonacci(n);
        return fib[n-1];
    }

    public static void printFibonacci(int n)
    {
        int [] fib=returnFibonacci(n);
        System.out.println("Fibonacci Series of length "+ n+ ":");
        for(i=0;i<n;i++)
            System.out.println(fib[i]);

    }

   public static void main(String[] args)
    {

        System.out.println("Fibonacci Series "+ 10+ "th element: "+returnNthInFibonacci(10)); //should return 34
        printFibonacci(5);  // should retun 0,1,1,2,3
    }

}
