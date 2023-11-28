import java.util.*;
import java.lang.Error;
import java.lang.String;

public class StringCharCount {
    public static void main(String[] rko) {
        String str = "malayalam";
        int len = str.length();
        char arr[] = new char[len];
        int temp[] = new int[len];
        //char arr[] = str.toCharArray();
        //char ch = '1';

        
            for(int j=0;j<len;j++){
                arr[j]=str.charAt(j);
            }
        
            //System.out.println(Arrays.toString(arr));
            //System.out.println(Arrays.toString(temp));

        //int count =1;
        for(int i=0;i<len;i++){
            int count = 1;                //'m' 'a' 'l' 'a' 'y' 'a' 'l' 'a' 'm'
            for(int j=i+1;j<len;j++){     // 2   4   2  -1   0  -1  -1   -1   -1
                if(arr[i]==arr[j]){
                    count++;
                    temp[j]=-1;
                    //arr[j]=-1;
                    
                }
            }
            if(temp[i]!=-1) temp[i]=count++;
        }
        System.out.println(Arrays.toString(temp));

        for(int i=0;i<len;i++){
            if(temp[i]!=-1){
                System.out.println(arr[i]+" "+temp[i]+" times");
            }
        }
    }
}
