import java.util.*;
import java.lang.Error;

public class StringPrintOnebyOne {
    public static void main(String[] rko) {
        String str ="prakashraj";

        System.out.println(str);
        for(int i=0;i<str.length();i++){
            if(i==0 || i%2==0) System.out.print(str.charAt(i)+"  ");
        }

        System.out.println();
        for(int i=0;i<str.length();i++){
            if(i==0 || i%2==0){
                char ch = ' ';
                ch = Character.toUpperCase(str.charAt(i));
                System.out.print(ch);
            }
            else{
                char ch1 = ' ';
                ch1 = Character.toLowerCase(str.charAt(i));
                System.out.print(ch1);
            }
        }

    }
}
