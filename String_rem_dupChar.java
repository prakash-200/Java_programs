import java.util.*;
import java.lang.Error;
import java.util.Scanner;
import java.util.Arrays;

public class String_rem_dupChar {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int len = str.length();
        int arr[] = new int[len];

        for(int i=0;i<len;i++){
            int count = 1;
            for(int j=i+1;j<len;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1) arr[i] = count;
        }

        System.out.println("after removal of dup char:");
        // for(int res:arr){
        //     if(res==1){
        //         System.out.println(res);
        //     }
        // }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1) System.out.print(str.charAt(i));
        }
    }
}
