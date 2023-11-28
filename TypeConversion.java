import java.util.*;
import java.lang.Error;

public class TypeConversion {
    public static void main(String[] rko) {
        String str = "prakash";
        int num = 108;
        String str2 = "12345";
        char ch = str.charAt(0); 

        String s = String.valueOf(str.charAt(0));

        String s1 = Integer.toString(num);
        int num2 = Integer.parseInt(str2);

        System.out.println(ch);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(num2);
    }
}
