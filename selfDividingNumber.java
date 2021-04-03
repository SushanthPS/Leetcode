import java.util.*;
public class selfDividingNumber {
    public static void main(String[] args)
    {
        int left=1;
        int right=22;
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
            if(isSelfDivide(i))
                list.add(i);
        System.out.println(list);
    }

    public static boolean isSelfDivide(int i)
    {
        int temp=i;
        int digit;
        while(temp!=0)
        {
            digit=temp%10;
            if(digit==0 || i%digit!=0)
                return false;
            temp/=10;

        }
        return true;
    }

}
