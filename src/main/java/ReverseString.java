package main.java;

public class ReverseString {

    public static void printReverseString(String str)
    {
        int i;
        int len=str.length();
        System.out.println("Input string: "+str);
        System.out.print("Reverse string: ");
        /*
        for(i=len-1;i>=0;i--)
            System.out.print(str.charAt(i));
         */

        String revStr="";
        for(i=len-1;i>=0;i--)
            revStr= revStr + (str.charAt(i));
        System.out.print(revStr);
    }

    public static void main(String[] args)
    {
        printReverseString("apple");
    }
}
