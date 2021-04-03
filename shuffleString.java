import java.util.*;
public class shuffleString {
    public static void main(String[] args)
    {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};

        char[] ans=new char[s.length()];

        for(int i=0;i<s.length();i++)
        {
            ans[indices[i]]=s.charAt(i);
        }
        System.out.println(String.valueOf(ans));
    }
}
