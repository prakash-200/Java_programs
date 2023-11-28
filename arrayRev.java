import java.util.*;
import java.lang.Error;
import java.util.Arrays;
import java.util.Scanner;

public class arrayRev {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int len = arr1.length;
        int temp = len-1;
        int arr2[] = new int[len];

        System.out.print("Enter your seat number:");
        Scanner scn = new Scanner(System.in);
        int seat = scn.nextInt();

        for(int i=0;i<len;i++){
            arr2[temp]=arr1[i];
            temp--;   
        }
         System.out.println("Reversed seat is: "+arr2[seat]);
        
    }
}
