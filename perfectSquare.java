import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);  //perfect square program
        System.out.println("enter a value:");
        int value = scn.nextInt();
        int res=0;
        

        for(int i=1;i<=value;i++){
            res=i*i;
            System.out.print(res+" ");
            
        }
    }
}
