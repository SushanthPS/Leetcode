import java.util.*;
public class meanOfArrayAfterRemovingElements {
    public static void main(String[] args)
    {
        int[] arr={6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        int sum=0;
        Arrays.sort(arr);
        int n=arr.length/20;
        for(int i=n;i<arr.length-n;i++)
            sum+=arr[i];

        System.out.println((double)sum/(arr.length-(n*2)));
    }
}
