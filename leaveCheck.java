import java.util.*;
import java.lang.Error;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;


public class leaveCheck {
    public static void main(String[] args){
        
        System.out.print("Enter employee count:");
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        int arr[] = new int [count];
        int temp = 0;

        for(int i=0;i<count;i++){
            arr[i]=scn.nextInt();
        }
         
        Arrays.sort(arr);
        System.out.println("minimum leave taken:"+arr[temp]);
        System.out.println("maximum leave taken:"+arr[count-1]);
    }

}
