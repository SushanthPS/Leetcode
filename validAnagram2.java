import java.util.*;
public class validAnagram2 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        if(s.length()!=t.length())
            System.out.println(false);

        int[] arr=new int[26];

        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for(int count:arr)
            if(count!=0)
                System.out.println(false);

        System.out.println(true);
    }

}