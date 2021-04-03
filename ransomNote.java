import java.util.*;
public class ransomNote {
    public static void main(String[] args)
    {
        String ransomNote="aa";
        String magazine="aab";
        int[] arr=new int[26];
        for(char c:magazine.toCharArray())
            arr[c-'a']++;

        for(char c:ransomNote.toCharArray())
        {
            if(arr[c-'a']==0)
            {
                System.out.println("false");
                break;
            }
            arr[c-'a']--;
        }
        System.out.println("true");
    }
}
