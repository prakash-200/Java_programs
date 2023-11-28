import javaa.util.*;
import java.lang.Error;
import java.util.Scanner;

public class rotation {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        int rot = scn.nextInt();
        int arr[] = new int[]{1,2,3,4,5,6};

        for(int i=0;i<rot;i++){
            int dup = arr[arr.length-1];   
            int j=arr.length-1;                        //0 1 2 3 4 5
            for(j=arr.length-1;j>0;j--){              // 1 2 3 4 5 6 
                arr[] = arr[j];
            }
            arr[j]=dup;
        }

        for(int i=0;i<arr.length;i++) System.out.print(arr[i]);
    }
}
