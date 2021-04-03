import java.util.*;
public class moveZeroes {
    public static void main(String[] args)
    {
        int[] nums={0,1,0,3,12};
        int i=0;
        for(int j:nums)
            if(j!=0)
            {
                nums[i]=j;
                i++;
            }

        for(;i< nums.length;i++)
            nums[i]=0;


    }
}
