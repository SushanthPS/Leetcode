import java.util.*;
public class checkIfAll1sAreKplacesAway {
    public static void main(String[] args)
    {
        int[] nums={1,0,0,0,1,0,0,1};
        int k=2;

        int last1=-1;

        for(int i=0;i<nums.length;i++)
        {
            if(last1==-1 && nums[i]==1)
                last1=i;
            else if(nums[i]==1)
            {
                if((i-last1)<=k)
                    System.out.println("false");
                last1=i;
            }

        }
    }
}
