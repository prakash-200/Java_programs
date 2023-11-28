import java.util.*;
import java.lang.Error;

public class arrayLargestAscend {
    public static void main(String args[]){
        int arr[]={11,3,4,2,10,7,9,5};
        int len=arr.length;
        int res[]=new int[arr.length];

        for(int i=0;i<len;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    res[i]=arr[j];
                }
                else{
                    res[i]=arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
