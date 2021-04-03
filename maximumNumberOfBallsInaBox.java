import java.util.*;
public class maximumNumberOfBallsInaBox {
    public static void main(String[] args)
    {
        int lowLimit=19;
        int highLimit=28;
        System.out.println(countBalls(lowLimit,highLimit));
    }
    public static int countBalls(int lowLimit,int highLimit)
    {
        int[] ans=new int[100];
        int max=0;
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int n=i;
            int sum=0;
            while(n!=0)
            {
                sum+=n%10;
                n/=10;
            }
            ans[sum]++;
            max=Math.max(max,ans[sum]);
        }
        return max;

    }
}
