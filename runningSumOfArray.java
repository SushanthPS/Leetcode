import java.util.*;
public class runningSumOfArray {
    public static void main(String[] args)
    {
        int[] nums={3,1,2,10,1};
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            nums[i]=sum;
        }
        for(int j:nums)
            System.out.print(j+" ");
    }
}
