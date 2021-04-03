import java.util.*;
public class KthMissingPositiveNumber {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        int k=2;
        System.out.println(findKthPositive(arr,k));

    }
    public static int findKthPositive(int[] arr,int k)
    {
        int[] ans=new int[arr[arr.length-1]+1];
        for(int i:arr)
            ans[i]++;

        for(int i=1;i<ans.length;i++) {
            if (ans[i] == 0)
                k--;
            if (k == 0)
                return i;
        }
        return ans.length-1+k;

    }

}
