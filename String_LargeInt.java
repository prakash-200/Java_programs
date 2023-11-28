import java.util.*;
import java.lang.Error;

public class String_LargeInt {
    public static void main(String[] rko) {
        String str = "pizza104burger38chips597hot";
        String st = "";

        //int n = 0;
        char ch;
        int a=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){  // 10438597
                //\n = (n*10)+str.charAt(i);
                ch = str.charAt(i);
                a = (a*10)+(int)ch;
                System.out.print(ch);
                // a = (a*10)+(int)ch;
                //st = st+ch;
                //System.out.print(ch);
            }
           
        }
        System.out.println();
        System.out.print(a);
    }
}

