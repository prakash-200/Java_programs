import java.util.*;
import java.lang.Error;
import java.util.Arrays;

public class arrayZeroSegre {
    public static void main(String[] args){
        int arr[] = {12,0,2,0,41,0,25,0,15,0,10,0};
        int temp=0;

        System.out.println("before zero's sort:");
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                while(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
        }
        System.out.println("array after zero segregation:");
        System.out.println(Arrays.toString(arr));

    }
}
