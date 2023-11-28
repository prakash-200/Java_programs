import java.util.*;
import java.lang.Error;
import java.lang.String;

public class String_Split {
    public static void main(String[] rko) {
        String ex = "welcome to java and python and C++";
        String sp[] = ex.split(" ");

        for(int i=0;i<sp.length;i++){
            String ch = sp[i];
            for(int j=ch.length()-1;j>=0;j--){
                System.out.print(ch.charAt(j));
            }
            System.out.print(" ");
        }

        System.out.println();

        long num = 7397180390l;
        String res = String.valueOf(num);
        
        for(int i=res.length()-1;i>=0;i--){
            System.out.print(res.charAt(i));
        }
    }
}
