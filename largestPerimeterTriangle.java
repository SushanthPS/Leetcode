import java.util.*;
public class largestPerimeterTriangle {
    public static void main(String[] args)
    {
        int[] A={3,2,3,4};
        Arrays.sort(A);

        for(int i=A.length-1;i>=2;i--)
            if(A[i]<A[i-1]+A[i-2]) {
                System.out.println(A[i] + A[i - 1] + A[i - 2]);
                break;
            }

        System.out.println("0");
    }
}
