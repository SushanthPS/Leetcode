public class findNumberWithEvenNumberOfDigits {
    public static void main(String[] args)
    {
        int[] nums={12,345,2,6,7896};
        int count=0;

        for(int i:nums)
            if(hasEvenDigits(i))
                count++;

        System.out.println(count);
    }
    public static boolean hasEvenDigits(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        if(count%2==0)
            return true;
        else
            return false;

    }
}

