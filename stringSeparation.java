import java.util.*;
import java.lang.Error;


public class stringSeparation {
    public static void main(String args[]){
        String str1 = "mahendra engineering college";

        int len= str1.length(); //separating character in string
        System.out.println(len);;
        
        for(int i=0;i<len;i++){
            System.out.println(str1.charAt(i)+" ");
        }
    }
}
