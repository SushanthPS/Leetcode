public class maxScoreAfterSplittingString {
    public static void main(String[] args)
    {
        String s="011101";
        System.out.println(maxScore(s));
    }
    public static int maxScore(String s)
    {
        int count1=0;
        int count0=0;
        int sum=0;

        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='1')
                count1++;

        for(int i=0;i<s.length()-1;i++) {
            if (s.charAt(i) == '0')
                count0++;
            else
                count1--;
            sum = Math.max(sum, count0 + count1);
        }
        return sum;

    }
}
