import java.util.*;
public class addStrings {
    public static void main(String[] args)
    {
        String num1="9";
        String num2="1";
        System.out.println(addValues(num1,num2));
    }
    public static String addValues(String num1,String num2)
    {
        int p1=num1.length()-1;
        int p2=num2.length()-1;
        StringBuilder ans=new StringBuilder();
        int carry=0;
        int value=0;


        while(p1>=0 || p2>=0)
        {
            int x1=p1>=0?num1.charAt(p1)-'0':0;
            int x2=p2>=0?num2.charAt(p2)-'0':0;
            value=(x1+x2+carry)%10;
            carry=(x1+x2+carry)/10;
            ans.append(value);
            p1--;
            p2--;

        }
        if(carry>0)
            ans.append(carry);

        return ans.reverse().toString();
    }
}
