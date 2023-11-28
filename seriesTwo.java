import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class seriesTwo {
    public static void main(String[] args){
     
        int num =0;
        int m =2;
        System.out.println("Enter a number:");
        Scanner scn = new Scanner(System.in);  // 1 3 7 15 31 series program
        int val = scn.nextInt();

        for(int i=0;i<val;i++){
           num = num*m+1;
           System.out.print(num+" ");
           
        }
    }
}
