import java.util.*;
import java.util.Scanner;
import java.lang.Error;
import java.lang.String;

public class DupCharCount {
    public static void main(String[] rko) {
        

    Scanner scn = new Scanner(System.in);
    String str = scn.next();

    char temp[] = str.toCharArray();
    int arr[] = new int[str.length()];

    for(int i=0;i<str.length();i++){
        int count  = 1;
        for(int j=i+1;j<str.length();j++){
            if(temp[i]==temp[j]){
                count++;
                temp[j]=0;
                arr[j]=0;
            }
        }
        if(arr[i]==0) arr[i]=count;
        //System.out.println(arr[i]);
    }

    for(int i=0;i<arr.length;i++){
         if(temp[i]!=0) System.out.println(str.charAt(i)+" repeats : "+arr[i]+" times");
    }
}
}
