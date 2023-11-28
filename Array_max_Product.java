import java.util.*;
import java.lang.Error;

public class Array_max_Product {
    public static void main(String[] rko) {
        int nums[] = {-100,-98,-1,2,3,4};
        Arrays.sort(nums);
        int len = nums.length;
        int prod= 0;

        prod = nums[len-1]*nums[len-2]*nums[len-3];
        
        System.out.println("final product : "+prod);
    }
}
