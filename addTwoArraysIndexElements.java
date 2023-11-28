import java.util.*;
import java.lang.Error;

public class addTwoArraysIndexElements {
    public static void main(String args[]){
        int arr[]={1,2,3};
        int len = arr.length;
        int arr1[]={1,2,3,4};
        int len1 = arr1.length;
        int disp[] = new int[len];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                disp[i]= arr[i]+arr1[j];
            }
        }

        for(int res:disp){
            System.out.println(res);
        }


    }
}
