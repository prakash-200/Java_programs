import java.util.*;
import java.lang.Error;
import java.util.Arrays;
import java.lang.String;

public class StrintoArray {
    public static void main(String[] rko) {
        String str ="priya_hexaware_zoho";
        int len = str.length();
        char arr[] = new char[len];

        for(int i=0;i<len;i++){
            arr[i] = str.charAt(i);
        }

        for(char res:arr) System.out.print(res+" ");

        System.out.println(arr[2]);

        for(int i=0;i<len;i++){
            System.out.println(Arrays.toString(arr));
        }
    }
}
