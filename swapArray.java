import java.util.*;
import java.lang.Error;
import java.util.Arrays;

public class swapArray {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        int len = arr1.length;
        int temp = len;
        int arr2[] = new int[len];

        for(int i=0;i<len;i++){
            arr2[temp-1] = arr1[i];
            temp--;

        }

        for(int res:arr2){
            System.out.print(res+" ");
        }
    }
}
