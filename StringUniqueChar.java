import java.util.*;
import java.lang.Error;

public class StringUniqueChar {
    public static void main(String[] rko) {
        String str = "1234";
        int len = str.length();
        int valid = 0;

        for(int i=0;i<len;i++){
            //for(int j=0;j<len;j++){
                if(str.charAt(i)>=65 || str.charAt(i)<=90 || str.charAt(i)>=97 || str.charAt(i)<=122){
                    valid++;
                }
            
        }
        if(valid!=0) System.out.println("Invalid sentence");
    }
}
