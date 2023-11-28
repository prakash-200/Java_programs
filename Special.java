import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class Special {
    public static void main(String[] rko) {
        String str = "PRAKASHraj144$%RAj";
        int len = str.length();
        int caps = 0,sml = 0,spl = 0,num =0;

        for(int i=0;i<len;i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90) caps++; 
            else if(str.charAt(i)>=97 && str.charAt(i)<=122) sml++;
            else if(str.charAt(i)>=48 && str.charAt(i)<=57) num++;
            else if(str.charAt(i)>=33 && str.charAt(i)<=47) spl++;
        }

        System.out.println("caps = "+caps);
        System.out.println("small = "+sml);
        System.out.println("number = "+num);
        System.out.println("special = "+spl);
    }
}
