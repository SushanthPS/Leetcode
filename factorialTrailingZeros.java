public class factorialTrailingZeros {
    public static void main(String[] args) {
        int n = 30;
        int ans=0;
        while(n>0)
        {

            ans+=n/5;
            n=n/5;
        }
        System.out.println(ans);
    }
}
