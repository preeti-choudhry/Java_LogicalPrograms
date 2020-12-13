package main.java;

//This logic has Time Complexity of O(n^2), and Space Complexity of O(1).
public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return null;
        }

        if (s.length() == 1) {
            return s;
        }

        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            /*** get longest palindrome with center of i, i ***/
            String temp = returnPalindrome(s, i, i);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
            //print each Palindrome found with length>1
            if (temp.length()>1)
                System.out.println("Found Palindrome: "+ temp+" , with length="+temp.length());


            /*** get longest palindrome with center of i, i+1 ***/
            temp = returnPalindrome(s, i, i + 1);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
            //print each Palindrome found with length>1
            if (temp.length()>1)
                System.out.println("Found Palindrome: "+ temp+" , with length="+temp.length());
        }

        return longest;
    }

    // Given a center, either one letter or two letter,
    // Find longest palindrome
    public static String returnPalindrome(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);
    }

    public static void main(String[] args)
    {
        String result= longestPalindrome("bananass");
        System.out.println("Longest Palindrome is: "+result+" , with length="+result.length());

    }
}
