import java.util.*;
public class validPalindrome1 {
    public static void main(String[] args)
    {
        String s="A man, a plan, a canal: Panama";
        s=s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<=r)
        {
            if(s.charAt(l)!=s.charAt(r)) {
                System.out.println("Not a palindrome");
                break;
            }
            l++;
            r--;
        }

    }
}
