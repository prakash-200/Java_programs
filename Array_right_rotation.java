import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class Array_right_rotation {
    public static void main(String[] rko) {
        int arr[] = {1,2,3,4,5};                  // 1 2 3 4 5
        int len = arr.length;                    //  5 1 2 3 4
        Scanner scn = new Scanner(System.in);
        int rot = scn.nextInt();

        for(int i=0;i<rot;i++){
           int temp = arr[len-1];
           for(int j=len-1;j>0;j--){
            arr[j] = arr[j-1];
           }
           arr[0] =temp;
        }
        System.out.println(Arrays.toString(arr));
        for(int res:arr) System.out.print(res);
    }
}
