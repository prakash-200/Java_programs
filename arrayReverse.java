import java.util.*;
import java.lang.Error;
import java.util.Arrays;


public class arrayReverse {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10}; //reverse array without using another array
        int len = arr.length-1;
        System.out.println("Given array:");
        System.out.print(Arrays.toString(arr));

        System.out.println();
        System.out.println("Reversed array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[len]+" ");
            len--;
        }
    }
}
