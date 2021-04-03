import java.util.*;
public class maxSumOfArrayAfterKnegation {
    public static void main(String[] args)
    {
        int[] A={4,2,3};
        int K=1;
        Arrays.sort(A);
        int sum=0;

        for(int i=0;i<A.length;i++)
        {
            if(A[i]<=0 && K>0)
            {
                A[i]*=-1;
                K--;
            }
        }

        Arrays.sort(A);
        if(K%2==1)
        {
            A[0]*=-1;
        }



        for(int num:A)
            sum+=num;

        System.out.println(sum);
    }
}
