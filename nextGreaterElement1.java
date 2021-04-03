import java.util.*;

public class nextGreaterElement1 {
    public static void main(String[] args)
    {
        int[] nums1={2,4};
        int[] nums2={1,2,3,4};
        System.out.println(Arrays.toString(nextGreatestElement(nums1,nums2)));

    }
    public static int[] nextGreatestElement(int[] nums1,int[] nums2)
    {
        Map<Integer,Integer> map=new HashMap<>();
        boolean flag;
        for(int i=0;i<nums2.length;i++)
        {
            flag=true;
            for (int j = i + 1; j < nums2.length; j++)
            {
                if(nums2[j]>nums2[i])
                {
                    map.put(nums2[i],nums2[j]);
                    flag=false;
                    break;
                }
            }
            if(flag)
                map.put(nums2[i],-1);

        }

        for(int i=0;i<nums1.length;i++)
            nums1[i]=map.get(nums1[i]);

        return nums1;
    }
}
