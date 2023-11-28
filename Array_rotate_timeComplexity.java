import java.util.*;
import java.lang.Error;
public class Array_rotate_timeComplexity {
    public static void main(String[] rko) {
        int nums[] = {1,2,3,4,5,6,7};
        int k=3;
        int len = nums.length;
        k=k%len;
        for(int i=0;i<k;i++){
        //    int temp = nums[nums.length-1];
        //    for(int j=nums.length-1;j>0;j--){
        //     nums[j] = nums[j-1];
        //    }
        //    nums[0] =temp;
        if(i<k)
        {
            System.out.print(nums[len + i - k] + " ");
        }
        else
        {
            System.out.print(nums[len - k] + " ");
        }
    }
    System.out.println();
    
    }
}
