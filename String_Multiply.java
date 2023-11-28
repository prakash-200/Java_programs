import java.util.*;
import java.lang.Error;
public class String_Multiply {
    public static void main(String[] rko) {
        String num1 = "6913259244";
        String num2 = "71103343";

        long num = 6913259244l*71103343l;
        System.out.println(num);
        
        long numb1 = Integer.parseInt(num1);
        System.out.println(numb1);
        long numb2 = Integer.parseInt(num2);
        long mul = numb1*numb2;
        System.out.println(mul);
        String result = String.valueOf(mul);
        System.out.println(result);
    }
}
