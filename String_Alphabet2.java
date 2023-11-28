import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class String_Alphabet2 {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        

        for(int i=0;i<str.length();i++){
            int value = 122;
            char ch = 0;
            ch = str.charAt(i);
            int a = 0;
            a = ch;
            int rem = a-97;
            value-=rem;
            System.out.print((char)value+" ");
        }
    }
}
