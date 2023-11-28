import java.util.*;
import java.util.Scanner;
import java.lang.Error;

public class Pattern {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        int limit = scn.nextInt();
        Example ex = new Example();
        ex.logic(limit);
    }
}
class Example{
    public void logic(int limit){
        for(int i=0;i<limit;i++) System.out.print("*");
        System.out.println();
        for(int i=limit-2;i>=0;i--){
            for(int j=limit-2;j>=-1;j--){
                if(i<=j) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
