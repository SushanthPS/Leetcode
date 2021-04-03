import java.util.*;
public class monotonicArray {
    public static void main(String[] args)
    {
        boolean flag=true;
        int[] A={1,1,1};
        if(A[0]<=A[A.length-1])
        {
            for(int i=0;i<A.length-1;i++)
                if(A[i]>A[i+1])
                    flag=false;
        }
        else if(A[0]>=A[A.length-1])
        {
            for(int i=0;i<A.length-1;i++)
                if(A[i]<A[i+1])
                    flag=false;
        }
        System.out.println(flag);
    }
}
