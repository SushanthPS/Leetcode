public class validMountainArray {
    public static void main(String[] args)
    {
        int[] arr={0,2,3,4,5,2,1,0};

        int i=0;
        int n=arr.length;

        while(i+1<n && arr[i]<arr[i+1])
            i++;

        if(i==0 || i==n-1)
            System.out.println("false");

        while(i+1<n && arr[i]>arr[i+1])
            i++;

        if(i==n-1)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
