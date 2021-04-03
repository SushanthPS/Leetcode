public class arrangingCoins {
    public static void main(String[] args)
    {
        int n=1804289383;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n)
    {
        int low=0;
        int high=n;
        long mid;
        int ans=-1;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if((mid*(mid+1))/2<=n)
            {
                ans=(int)mid;
                low=(int)mid+1;
            }
            else
                high=(int)mid-1;
        }
        return ans;
    }
}

