import java.util.*;
import java.lang.Error;

public class Array_Peak {
    public static void main(String[] rko) {
        int nums[] = {1,2,3,1};
        int peak = 0,result = 0;
        for(int i=0;i<nums.length;i++){
            if(peak<nums[i]){
                result = i;
                System.out.println(result);
                peak = nums[i];
            } 
        }
        System.out.print(result);
    }
}
