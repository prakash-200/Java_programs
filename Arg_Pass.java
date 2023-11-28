import java.util.*;
import java.util.Scanner;
import java.lang.Error;

public class Arg_Pass {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        System.out.println(sum(a,b));
    }

    static public int sum(int c,int d){
        int e = c+d;
        return e;
    }
}
