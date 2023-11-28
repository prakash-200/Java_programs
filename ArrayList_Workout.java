import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class ArrayList_Workout {
    public static void main(String[] rko) {
    //     ArrayList<Integer> al = new ArrayList<Integer>();
    //     Scanner scn = new Scanner(System.in);
    //     int limit = scn.nextInt();

    //     for(int i=0;i<limit;i++){
    //         al.add(scn.nextInt());
    //     }

        
    //    Object arr[] = al.toArray();
    //    System.out.println(arr[3]);

       int arr2[] = {1,2,3,4,5};
       Arrays.sort(arr2);
       //System.out.println(Arrays.toString(arr2));
       for(int j=0;j<5;j++){
        if(arr2[j]==3){
            arr2[j] = 10;
        }
       }
       System.out.println(Arrays.toString(arr2));
    }
}
