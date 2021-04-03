import java.util.*;
public class decompressRunLengthEncodedList {
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4};
        int n=0;
        for(int i=0;i<nums.length;i+=2)
            n+=nums[i];

        int[] ans=new int[n];
        int index=0;

        for(int i=0;i<nums.length;i+=2)
            for(int j=0;j<nums[i];j++)
            {
                ans[index]=nums[i+1];
                index++;
            }

        for(int i:ans)
            System.out.print(i+" ");
    }
}
