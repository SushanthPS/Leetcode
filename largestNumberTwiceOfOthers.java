import java.util.*;
public class largestNumberTwiceOfOthers {
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4};
        int index=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
            if(nums[i]>max)
            {
                max=nums[i];
                index=i;
            }

        for(int i:nums) {
            if (i * 2 > max && i!=max) {
                index = -1;
                break;
            }
        }

        System.out.println(index);
    }
}
