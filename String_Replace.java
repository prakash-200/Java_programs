import java.util.*;
import java.lang.Error;

public class String_Replace {
    public static void main(String[] rko) {
        
        //System.out.println(str2);
        
        String str1 = "pRaKaShRaJ";

        for(int i=0;i<str1.length();i++){
            if(Character.isLowerCase(str1.charAt(i))){
                System.out.print(Character.toUpperCase(str1.charAt(i)));
            }
            else System.out.print(Character.toLowerCase(str1.charAt(i)));
        }
       System.out.println();

        char c = Character.toUpperCase(str1.charAt(2));
        str1 = str1.replace('a',c);
        System.out.println(str1);

        String f = str1.toUpperCase();
        System.out.print(f);
    }    
}
