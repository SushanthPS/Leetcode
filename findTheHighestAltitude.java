public class findTheHighestAltitude {
    public static void main(String[] args)
    {
        int[] gain={-5,1,5,0,-7};
        int max=0;
        int altitude=0;

        for(int i:gain) {
            altitude += i;
            if (altitude > max)
                max = altitude;
        }
        System.out.println(max);

    }
}
