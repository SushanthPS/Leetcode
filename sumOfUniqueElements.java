import java.util.HashMap;
import java.util.Map;

public class sumOfUniqueElements {
    public static void main(String[] args)
    {
        int[] nums={1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums)
    {
        int[] ans=new int[101];
        int sum=0;

        for(int i:nums)
            ans[i]++;

        for(int i=0;i<101;i++)
            if(ans[i]==1)
                sum+=i;

        return sum;

    }
}
