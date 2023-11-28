import java.util.*;
import java.lang.Error;

public class String_Comma_afetrChangeCase {
    public static void main(String[] rko) {
        String str = "welcome to java. python. c++";
        int len = str.length();
        String str2 = str.replace('.',',');

        for(int i=0;i<len;i++){
            if(str2.charAt(i)==44){
                if(str2.charAt(i+1)==32){
                    char ch = Character.toUpperCase(str2.charAt(i+2));
                    str2 = str2.substring(0,i+2)+ch+str2.substring(i+3);
                }
            }

        }
        System.out.print(str2);
    }

}
