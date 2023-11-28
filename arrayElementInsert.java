import java.util.*;
import java.lang.Error;
import java.util.Arrays;
import java.util.Scanner;

public class arrayElementInsert {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter array length:");
        int len  = scn.nextInt();
        int arr[] = new int[len+1];

        System.out.println("Enter elements to be add:");
        for(int i=0;i<len;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Enter position to be insert:");
        int position = scn.nextInt();

        System.out.println("Element to be add in existing array:");
        int value = scn.nextInt();

        /*System.out.println("Array before insertion:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/

        for(int i=len;i>position-1;i--){
            arr[i]=arr[i-1];
        }
        arr[position-1]=value;
       len++;

        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
}
/*
 Enter array length:
4
Enter elements to be add:
1
2
3
4
Enter position to be insert:
4
Element to be add in existing array:
9
1 2 3 9 4
 */