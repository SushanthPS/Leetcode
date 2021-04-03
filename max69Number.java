import java.util.*;
public class max69Number {
    public static void main(String[] args)
    {
        int num=9669;
        char[] ch=String.valueOf(num).toCharArray();
        for(int i=0;i<ch.length;i++)
            if(ch[i]=='6')
            {
                ch[i]='9';
                break;
            }

        System.out.println(Integer.valueOf(String.valueOf(ch)));
    }
}
