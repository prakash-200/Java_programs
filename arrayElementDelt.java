import java.util.*;
import java.lang.Error;
import java.util.Arrays;

public class arrayElementDelt {
    public static void main(String[] args){
        int arr[] =  new int[]{1,2,3,4,5};

    
        System.out.println("Before deletion:");
        System.out.println(Arrays.toString(arr));
    
        int arr1[] = new int[arr.length-1];
        
        int r=3;

        for(int i=0,k=0;i<arr.length;i++){
        
            if(i!=r){
                arr1[k]=arr[i];
                k++;
            }
        }

            System.out.println("After deletion:");
            System.out.println(Arrays.toString(arr1));
        

       
        

    

    }
}
