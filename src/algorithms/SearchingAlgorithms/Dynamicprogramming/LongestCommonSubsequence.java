package algorithms.SearchingAlgorithms.Dynamicprogramming;

public class LongestCommonSubsequence {

    static int longestSubsequence(char[]s1, char[] s2, int m,int n)
    {

        if(m==0|| n ==0)
            return 0;
        if(s1[m-1] == s2[n-1])
            return longestSubsequence(s1,s2,m-1,n-1);
        else
            return 1+Math.max(longestSubsequence(s1,s2,m,n-1), longestSubsequence(s1,s2,m-1,n));




    }

    public static void main(String args[])
    {
        String s1 = "asvsd";
        String s2 = "asdsd";
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        System.out.println(longestSubsequence(a,b,s1.length()-1,s2.length()-1));
    }
}
