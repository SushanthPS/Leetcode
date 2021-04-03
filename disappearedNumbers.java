import java.util.ArrayList;
import java.util.List;

class disappearedNumbers {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        int[] arr=new int[nums.length+1];
        for(int a:nums)
            arr[a]++;

        List<Integer> list=new ArrayList<Integer>();

        for(int i=1;i<arr.length;i++)
            if(arr[i]==0)
                list.add(i);

        System.out.println(list);


    }
}
