import java.util.*;
public class maxConsecutiveOnes {
    public static void main(String[] args)
    {
        int[] nums={1,1,0,1,1,1};
        int count=0;
        int max=0;
        for(int i:nums)
            if(i==1)
                count++;
            else
            {
                max=Math.max(max,count);
                count=0;
            }
        System.out.println(Math.max(max,count));
    }
}
