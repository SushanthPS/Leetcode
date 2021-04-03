class sqrt{
    public static void main(String[] args)
    {
        int x=2147395599;

        if(x==0 || x==1)
            System.out.println(x);

        long low=0;
        long high=x;
        long mid=0;
        int ans=0;
        while(low<=high)
        {

            mid=low+(high-low)/2;
            if(mid*mid==x)
            {
                System.out.println(mid);
                break;
            }

            else if(mid*mid>x)
                high=mid-1;

            else if(mid*mid<x)
            {
                low=mid+1;
                ans=(int)mid;
            }

        }
        System.out.println(ans);

    }
}