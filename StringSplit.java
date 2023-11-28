import java.util.*;
import java.lang.Error;

public class StringSplit {
    public static void main(String[] rko) {
        String str = "prakashr";
        int len = str.length()/2;

        System.out.println(len);

        for(int i=0;i<str.length();i++){
            if(i<len){
                System.out.print(str.charAt(i));
            }
            else System.out.print(" "+str.charAt(i));
        }


    }
}
