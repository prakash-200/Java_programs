import java.util.*;
import java.lang.Error;
public class Array_Jump {
    public static void main(String[] rko) {
        int nums[] = {3,2,1,0,4};
        int ind = nums.length-1;
        boolean result = false; 
        //int m = 1;
        if(nums.length==1){
            result = true;
            //break;
        }
        else{

        for(int m = 1;m<nums.length;m++){ //  3 2 1 0 4
            System.out.println("i value : "+m);
            int val = nums[m];
            System.out.println("index of i : "+val);
            int step = m+val;
            System.out.println("step value : "+step);
            if(ind == m){
                result = true;
                System.out.println(ind);
                System.out.println(m);
                System.out.println("if breaked");
                break;
            }
             else if(ind == step){
                result = true;
                System.out.println("else if breaked");
                break;
            }
            m = step-1;
            System.out.println("1 time finished");
        }
        }
        System.out.println(result);
 
    }
}
