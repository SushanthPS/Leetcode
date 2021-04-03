import java.util.*;
public class sortArrayByParity {
    public static void main(String[] args)
    {
        int[] A={3,1,2,4};
        int i=0;
        int[] ans=new int[A.length];

        for(int j=0;j<A.length;j++)
            if(A[j]%2==0)
            {
                ans[i]=A[j];
                i++;
            }

        for(int j=0;j<A.length;j++)
            if(A[j]%2!=0)
            {
                ans[i]=A[j];
                i++;
            }

        System.out.println(Arrays.toString(ans));

    }
}
