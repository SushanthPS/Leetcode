class commonPrefix {
    public static void main(String[] args) {
        int[] digits = {4, 3, 2, 9};
        boolean flag=true;
        int n=digits.length-1;

        while(flag)
        {
            if(n<0)
                break;
            if(digits[n]!=9)
            {
                digits[n]+=1;
                flag=false;
            }
            else
            {
                digits[n]=0;
                n-=1;
            }
        }

        for(int i=0;i<digits.length;i++)
            System.out.print(digits[i]);

    }
}
