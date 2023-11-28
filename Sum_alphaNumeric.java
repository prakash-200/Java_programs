import java.util.*;
import java.lang.Error;

public class Sum_alphaNumeric {
    public static void main(String[] args) {
        
    
    String str = "peter35";
    int sum = 0;

    for(int i=0;i<str.length();i++){
        if(str.charAt(i)<=57){
            sum = sum+i;
           
        }
    }
  System.out.println(sum);
}
}
