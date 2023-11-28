import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class array_left_rotation {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length of array");
        int len = scn.nextInt();
        int arr[] = new int[len]; // 1 2 3 4 5 ==> 5 1 2 3 4

        System.out.println("Enter array values");
        for(int i=0;i<len;i++) arr[i] = scn.nextInt();
        System.out.println("Enter array rotation times");
        int rot = scn.nextInt();

        for(int i=0;i<rot;i++){           // 1 2 3 4 5
            int temp = arr[0];           //  2 3 4 5 1
            int j = 0;          
            for(j=0;j<len-1;j++){
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
        }

        for(int res:arr) System.out.print(res+" ");
    }
}
