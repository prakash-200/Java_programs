import java.util.*;
import java.lang.Error;

public class Array_k_th_largest {
    public static void main(String[] rko) {
        int nums[] = {2,1};
        int len = nums.length;
        int k = 2;
        Arrays.sort(nums);
        // int temp[] = new int[nums.length];

        // if(nums.length==1){
        //     System.out.print(nums[0]); 
        // }
        // else{
        // int m = 0;
        // for(int i=nums.length-1;i>0;i--){
        //     temp[m++] = nums[i];
        // }

        // }

        System.out.println(nums[len-k]); 
 
    }
}
