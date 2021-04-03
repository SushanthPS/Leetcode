import java.util.*;
public class maximumSubarray {
    public static void main(String[] args)
    {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
            for(int j=i;j< nums.length;j++)
                max=Math.max(max,sumOfSubarray(i,j,nums));

        return max;
    }
    public static int sumOfSubarray(int i,int j,int[] nums)
    {
        int sum=0;
        for(int a=i;a<=j;a++)
            sum+=nums[a];
        return sum;
    }
}
