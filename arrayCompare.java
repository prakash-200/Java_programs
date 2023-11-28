import java.util.*;
import java.lang.Error;
import java.util.Arrays;

public class arrayCompare {
    public static void main(String[] args){

        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};
        int count=0;

       for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){  //compare two arrays are equal or not
            if(arr1[i]==arr2[j]){
                count++;
            }
        }

    }
    if(count==5){
        System.out.println("Two arrays are equal!!!");
    }
    else{
        System.out.println("Two are not equal!!!");
    }

    }
}
