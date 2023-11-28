import java.util.*;
import java.lang.Error;
import java.util.Scanner;
 

public class series {
    public static void main(String[] args){

        System.out.println("enter a value:");
        
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
                                             //1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 series program
        for(int i=0;i<=val;i++){
            for(int j=0;j<i;j++){
                
                System.out.print(i+" ");
                
            }
        }
    }

}

