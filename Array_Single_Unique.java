import java.util.*;
import java.lang.Error;
public class Array_Single_Unique {
    public static void main(String[] rko) {
        int nums[] = {2,2,1,5,4,4,5};
        int result = 0;
        int temp[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                //if(nums[i]==00) break;
                if(nums[i]==nums[j]){
                    temp[i] = 00;
                    temp[j] = 00; 
                    count++;
                }
            }
            System.out.println(count);
            if(count==1){
                temp[0] = nums[i];
                break;
            } 
        }
        System.out.println(Arrays.toString(temp));
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=00) result = temp[i];
        }
        //result = temp[0];
        System.out.print(result);

    }
}
