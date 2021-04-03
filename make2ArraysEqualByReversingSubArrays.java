public class make2ArraysEqualByReversingSubArrays {
    public static void main(String[] args)
    {
        int[] target={1,2,3,4};
        int[] arr={2,4,1,3};

        int[] ans=new int[1001];

        for(int i=0;i<target.length;i++)
        {
            ans[target[i]]++;
            ans[arr[i]]--;
        }

        for(int i=0;i<ans.length;i++)
            if(ans[i]!=0)
                System.out.println("False");


    }
}
