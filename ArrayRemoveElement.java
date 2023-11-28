import java.util.*;
import java.lang.Error;

public class ArrayRemoveElement {
    public static void main(String[] rko) {
        int nums[] = {3,2,2,3};
        int val = 3;
        ArrayList al = new ArrayList();
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=val){
               al.add(nums[i]);
           }
       }
       System.out.println(al.size()); 
    }
}
