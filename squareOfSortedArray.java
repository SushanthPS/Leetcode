import java.util.*;
public class squareOfSortedArray {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[] arr={-4,-2,0,3,6,9};
        for(int i=0;i<arr.length;i++)
            arr[i]=arr[i]*arr[i];

        Arrays.sort(arr);


        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
