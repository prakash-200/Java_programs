import java.util.*;
import java.lang.Error;
public class Array_LargerNumber {
    public static void main(String[] args) {
        int nums[] = {10,2};
        
        String s = Arrays.toString(nums).replaceAll("\\[|\\]", ""); 
        String s1 = s.replaceAll(", ",""); 
        

        //int num = Integer.parseInt(s1);

        StringBuffer sb = new StringBuffer(s1);
        StringBuffer sb2 = new StringBuffer(s1).reverse();

        String s3 = sb.toString();
        String s4 = sb2.toString();

        long num1 = Integer.parseInt(s3);
        long num2 = Integer.parseInt(s4);
        String result = "";

        if(num1>num2) result = String.valueOf(num1);
        else result = String.valueOf(num2);

         System.out.print(result);
     }
}