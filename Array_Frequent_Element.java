import java.util.*;
import java.util.HashSet;
import java.util.Collections;
import java.lang.Error;
public class Array_Frequent_Element {
    public static void main(String[] rko) {
        int nums[] = {1,1,1,2,2,3};
        Set<Integer> st = new HashSet<Integer>();
        int k = 2;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int result[] = new int[k];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    st.add(nums[i]);
                    count++;
                    //m++;
                    break;
                }
            }
            if(count==k) break;
        }
        System.out.println(st);

}
}