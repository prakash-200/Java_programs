import java.util.*;
import java.lang.Error;
import java.util.Arrays;

public class arrayZeroOneTwo {
    public static void main(String[] args){
        int arr[] ={1,2,0,1,0,2,0,1,2,2,1,0};
        int temp=0;
        
        System.out.println("Array before sort:");
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                while(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
        }
        System.out.println("Array after sort:");
        System.out.println(Arrays.toString(arr));
    }
}
