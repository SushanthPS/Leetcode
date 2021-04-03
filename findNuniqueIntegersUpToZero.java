import java.util.Arrays;

public class findNuniqueIntegersUpToZero {
    public static void main(String[] args)
    {
        int n=5;

        int[] ans=new int[n];
        int pos=0;

        for(int i=1;i<=n/2;i++)
        {
            ans[pos++]=i;
            ans[pos++]=i*-1;

        }
        System.out.println(Arrays.toString(ans));
    }
}
