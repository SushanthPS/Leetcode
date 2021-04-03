import java.util.*;
public class reverseOnlyLetters2 {
    public static void main(String[] args)
    {
        String S="a-bC-dEf-ghIj";
        int i=0;
        int j=S.length()-1;
        char[] ch=S.toCharArray();

        while(i<j)
        {
            if(!Character.isLetter(ch[i]))
                i++;
            else if(!Character.isLetter(ch[j]))
                j--;
            else
            {
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }

        }
        System.out.println(ch);
    }
}
