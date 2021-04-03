import java.util.*;
public class magneticForceBetween2Balls {
    public static void main(String[] args)
    {
        int[] position={5,4,3,2,1,1000000000};
        int m=2;

        Arrays.sort(position);
        int ans=-1;
        int low=1;
        int high=position[position.length-1]-position[0];
        int mid;


        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(magneticForce(position,m,mid)) {
                low = mid + 1;
                ans = mid;
            }
            else
                high=mid-1;

        }
        System.out.println(ans);
    }
    public static boolean magneticForce(int[] arr,int m,int mid)
    {
        int pos=arr[0];
        m-=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-pos>=mid)
            {
                m-=1;
                pos=arr[i];

            }
            if(m==0)
                return true;
        }
        return false;
    }
}
