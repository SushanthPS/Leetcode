public class singleNumberXOR {
    public static void main(String[] args)
    {
        int[] num={1,4,2,2,1};
        int i=0;
        for(int j:num) {
            i = i ^ j;
            System.out.println(i);
        }

    }
}
