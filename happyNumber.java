import java.util.*;
public class happyNumber {
    public static void main(String[] args)
    {
        int n=19;
        System.out.println(isHappy(n));

    }
    public static boolean isHappy(int n)
    {
        int count=0;
        int sum=0;
        while(n!=0)
        {
            sum+=(n%10)*(n%10);
            n/=10;

            if(sum==1 && n==0)
                return true;
            else if(n==0)
            {
                count++;
                n=sum;
                sum=0;
            }
            if(count>=10)
                break;

        }
        return false;

    }
}
