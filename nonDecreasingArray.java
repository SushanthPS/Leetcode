import java.util.*;
public class nonDecreasingArray {
    public static void main(String[] args)
    {
        int[] nums={3,4,2,3};
        int count=0;
        int max=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>max)
                max=nums[i];

            if (nums[i] > nums[i + 1] || nums[i]>max)
                count++;
        }

        if(count==1 || count==0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
