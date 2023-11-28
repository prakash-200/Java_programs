import java.util.*;
import java.lang.Error;
import java.util.ArrayList;
import java.util.List;

public class Object_to_Dataype {
    public static void main(String[] rko) {
        // Array Declaration
        int arr[] = {1,1,2,2,3,3,4,4,5};
        Set<Integer> st = new HashSet();
        System.out.println("Array elements : "+Arrays.toString(arr));

        // Array to Set conversion
        for(int i:arr) st.add(i);
        System.out.println("Set elements : "+st);

        //Set to Array conversion
        // Method 1
        int arr2[] = st.stream().mapToInt(i -> i).toArray();
        System.out.println("Array converted Method 1 : "+arr2[0]);

        // Method 2
        int arr3[] = new int[st.size()];
        int idx = 0;
        for(Integer i:st) arr3[idx++] = i;
        System.out.println("Array converted Method 2 : "+arr3[0]);
    
    }
}
