import java.util.*;
public class numberOfSegmentsInString {
    public static void main(String[] args)
    {

        String s="Hello,      my name is John";

        int space=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
                space++;

        System.out.println(space+1);

    }
}
