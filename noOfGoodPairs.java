import java.util.*;
public class noOfGoodPairs {
    public static void main(String[] args)
    {
        int[] nums={1,2,3,1,1,3};
        int pairs=0;
        int[] arr=new int[101];

        for(int i:nums)
        {
            pairs+=arr[i];
            arr[i]++;
        }
        System.out.println(pairs);
    }
}
//do the rough work to understand logic.
/*
for int i=1
pairs=0    arr[1]=1
pairs=1    arr[1]=2
pairs=3    arr[1]=3

 */
