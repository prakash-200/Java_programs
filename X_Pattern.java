import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class X_Pattern {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        int limit = scn.nextInt();

        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                if(i==j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
