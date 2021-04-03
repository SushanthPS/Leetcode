import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args)
    {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int n=3,m=3;
        merge(nums1,nums2,m,n);
    }
    public static void merge(int[] nums1,int[] nums2,int m,int n)
    {
        int first=m-1;
        int second=n-1;
        for(int i=nums1.length-1;i>=0;i--)
        {
            if(second<0)
                break;
            if(first>=0 && nums1[first]>nums2[second])
            {
                nums1[i]=nums1[first];
                first--;
            }
            else
            {
                nums1[i]=nums2[second];
                second--;
            }
        }
        System.out.println(Arrays.toString(nums1));

    }
}
