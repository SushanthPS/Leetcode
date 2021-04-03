import java.util.*;
public class sumOfEvenNumbersAfterQuery {
    public static void main(String[] args)
    {
        int[] A={1,2,3,4};
        int[][] queries={{1,0},{-3,1},{-4,0},{2,3}};

        int sum=0;
        for(int a:A)
            if(a%2==0)
                sum+=a;

        int[] ans=new int[queries.length];

        for(int i=0;i< queries.length;i++)
        {
            int index=queries[i][1];
            int value=queries[i][0];

            if(A[index]%2==0)
                sum-=A[index];

            A[index]+=value;

            if(A[index]%2==0)
                sum+=A[index];

            ans[i]=sum;
        }
        for(int i:ans)
            System.out.print(i+" ");


    }
}
