import java.util.*;
import java.lang.Error;
import java.util.Arrays;

public class Left_Right_rotate_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int limit  = scn.nextInt();   // 0  1  2  3  4
        int arr[] = new int[limit];  // 10 20 30 40 50
        //int temp[] = new int[limit];

        for(int i=0;i<limit;i++) arr[i] = scn.nextInt();
        int rot = scn.nextInt();
        //int len = limit-1;

        for(int  i=0;i<rot;i++){
            int dup = arr[arr.length-1];
            for(int j=limit-1;j>0;j--){ //  
                arr[j]=arr[j-1];
                //len--;
            }
            arr[0]=dup;
        }

        //for(int res:arr) System.out.println(res);

        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    }
}
