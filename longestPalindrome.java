import java.util.*;
public class longestPalindrome {
    public static void main(String[] args)
    {
        String s="abccccdd";
        int[] arr=new int[128];
        for(char ch:s.toCharArray())
            arr[ch]++;

        int ans=0;

        for(int v:arr)
            ans+=v/2*2;

        if(ans<s.length())
            ans++;

        System.out.println(ans);


    }
}
