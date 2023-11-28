import java.util.*;
import java.lang.Error;

public class Array_TwiceLarge {
    public static void main(String[] rko) {
        int nums[] = {0,0,2,3};
        int temp[] = nums.clone();
        boolean find = false;
        int result = -1;
        Arrays.sort(temp);
        int max = temp[temp.length-1];
        System.out.println(max);
        int max2 = max/2;
        System.out.println("max2 value : "+max2);

        for(int i=0;i<temp.length-1;i++){
            if(temp[i]+max2<=max) find = true;
            else{
                find = false;
                break;
            }
        }
        
        if(find){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==max){
                    System.out.println(nums[i]);
                    result = i;
                    break;
                }
            }
        }

        System.out.println(result);
 
    }
}
