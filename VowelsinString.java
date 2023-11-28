import java.util.*;
import java.util.Scanner;
import java.lang.Error;

public class VowelsinString {
    public static void main(String[] rko) {  // p r a k a s h e i o w e
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int len = str.length();

        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            
            if(str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)=='0' || str.charAt(i)=='u' || str.charAt(i)=='e') System.out.println(str.charAt(i));
            // switch(ch){
            //     case 'a':
            //     System.out.println("a");
            //     break;
            //     case 'e':
            //     System.out.println("e");
            //     break;
            //     case 'i':
            //     System.out.println("i");
            //     break;
            //     case 'o':
            //     System.out.println("o");
            //     break;
            //     case 'u':
            //     System.out.println("u");
            //     break;
                
            // }
        }
    }
}
