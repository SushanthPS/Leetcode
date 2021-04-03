import java.util.*;
public class replaceElementWithGreatestElementRightSide {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};


        int max = arr[arr.length-1];
        int temp;


        for (int i=arr.length-1; i>=0; i--)
        {
            temp=arr[i];
            arr[i]=max;
            if(temp>max)
                max=temp;

        }

        System.out.println(Arrays.toString(arr));
    }
}


