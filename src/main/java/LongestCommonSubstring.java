package main.java;

public class LongestCommonSubstring {

    static int begin;
    static int end;

    public static int getLongestCommonSubstring(String a, String b){
        int m = a.length();
        int n = b.length();

        int max = 0;

        int[][] dp = new int[m][n];
        int i=0,j=0;
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                if(a.charAt(i) == b.charAt(j))
                {
                    end=i;

                    if(i==0 || j==0){
                        dp[i][j]=1;

                    }else{
                        dp[i][j] = dp[i-1][j-1]+1;

                    }

                    if(max < dp[i][j])
                        max = dp[i][j];
                }

            }
        }


        return max;
    }

    public static void printLongestCommonSubstring(String str1,String str2)
    {
        int max=getLongestCommonSubstring(str1,str2);
        System.out.println("Str1: "+str1+" , Str2: "+str2);
        System.out.println("Longest Common Substring has length: "+max);
        begin=end-max+1;
        System.out.println("begin_index:"+ begin+" , end_index:"+end);
        for(int x=begin;x<=end;x++)
            System.out.print(str1.charAt(x));

    }

    public static void main(String[] args)
    {
        String str1="aabcda";
        String str2="abcdac";
        printLongestCommonSubstring(str1,str2);

    }
}
