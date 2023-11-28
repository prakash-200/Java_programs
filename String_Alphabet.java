import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class String_Alphabet {
    public static void main(String rko[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        for(int i=0;i<str.length();i++){
            char ch = ' ';
            ch = str.charAt(i);
            switch(ch){
                case 'a':
                System.out.print("z");
                break;
                case 'b':
                System.out.print("y");
                break;
                case 'c':
                System.out.print("x");
                break;
                case 'd':
                System.out.println("w");
                break;
                case 'e':
                System.out.println("v");
                break;
                case 'f':
                System.out.print("u");
                break;
                
            }
        }
    }
}
