import java.util.*;
import java.lang.Error;
import java.util.Arrays;

public class arraysCopy {
    public static void main(String[] args){
        int arr1[] = {3,5,1,2,10,7,9,4,8,6};
        int arr2[] = {15,20,19,12,16,18,17,14,11,13};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] res = new int[len1+len2];
        int temp=10;

        for(int i=0;i<len1;i++){
            res[i]=arr1[i];
        }
       
        for(int j=0;j<len2;j++){
            res[temp] = arr2[j];
            temp++;
        }
        System.out.println("Merged two arrays:");
        System.out.println(Arrays.toString(res));

        sortArray(res);
        
    }

    static void sortArray(int res[]){
        int tmp=0;
        for(int m=0;m<res.length;m++){
            for(int k=m+1;k<res.length;k++){
                if(res[m]>res[k]){
                    tmp=res[m];
                    res[m]=res[k];
                    res[k]=tmp;
                    
                }
            }
        }
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(res));
        
    }
}
