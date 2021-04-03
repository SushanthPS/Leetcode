import java.util.*;
public class reverseString {
    public static void main(String[] args)
    {
        char[] s={'h','e','l','l','o'};
        char temp;
        int n=s.length-1;
        for(int i=0;i<=n;i++)
        {
            temp=s[n];
            s[n]=s[i];
            s[i]=temp;
            n--;
        }
        System.out.println(s);
    }
}
