import java.util.*;
public class validPalindrome2 {
    public static void main(String[] args)
    {
        String s="abca";
        int l=0;
        int r=s.length()-1;
        int count=0;
        while(l<=r)
        {
            if(s.charAt(l)!=s.charAt(r))
                count++;
            if(count>1)
                System.out.println("Not a palindrome");
            l++;
            r--;
        }
    }
}
//WRONG ANSWER