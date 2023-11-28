import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        int x=0;
        int y=1;
        int z=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a value:");//fibonacci series
        int val = scn.nextInt();
        System.out.print(x+" "+y+" ");

        for(int i=0;i<val;i++){
            
            z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;

            
        }
    }
}
