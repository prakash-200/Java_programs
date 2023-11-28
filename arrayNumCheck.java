import java.util.*;
import java.util.Arrays;
import java.lang.Error;

public class arrayNumCheck {
    public static void main(String[] args){
        int arr[]=new int[]{2,3,5,61,67,53,20,15,6};
        int len=arr.length;
        int arr1[]=new int[arr.length];
        
        int temp=0;
        

        arr1=Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
