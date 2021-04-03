import java.util.*;
public class maxAverageSubArray1 {
    public static void main(String[] args)
    {
        int[] nums={1,12,-5,-6,50,3};
        int k=4;


        double sum=0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        double ans=sum;


        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[i-k];
            if(sum>ans)
                ans=sum;
        }

        System.out.println(ans/k);

    }
}
