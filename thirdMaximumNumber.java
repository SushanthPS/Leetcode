import java.util.*;
public class thirdMaximumNumber {
    public static void main(String[] args)
    {
        int[] nums={2,2,3,1};
        Set<Integer> set=new HashSet<>();
        int max=nums[0];
        int min=nums[0];
        for(int i:nums)
        {
            set.add(i);
            if(i>max)
                max=i;
            if(i<min)
                min=i;
        }

        int secondMax=min;

        for(int i:nums)
            if(i>secondMax && i<max)
                secondMax=i;

        int thirdMax=min;

        for(int i:nums)
            if(i>thirdMax && i<secondMax)
                thirdMax=i;
        System.out.println(thirdMax);

    }
}
