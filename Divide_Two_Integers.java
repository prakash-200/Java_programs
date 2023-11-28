import java.util.*;
import java.lang.Error;

public class Divide_Two_Integers {
    public static void main(String[] rko) {
        int dividend = -2147483648;
        int divisor = -1;
        long result = dividend/divisor;
        if((dividend<0) && (divisor<0)) System.out.print( (int)(result*1));
        else System.out.print( (int)result);
    }
}
