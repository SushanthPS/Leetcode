public class peakIndexInMountainArray {
    public static void main(String[] args)
    {
        int[] arr={24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndex(arr));

    }
    public static int peakIndex(int[] arr)
    {
        int low=1;
        int high=arr.length-2;
        int mid=-1;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid]>arr[mid+1])
                high=mid-1;
            else
                low=mid+1;
        }
        return mid;
    }
}
