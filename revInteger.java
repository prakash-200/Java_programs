import java.util.*;
import java.util.Scanner;
import java.lang.Error;

public class revInteger{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scan.nextInt();
        
        int rem=0,rev=0;

        while(input>0){
            rem=input%10;
            rev=rev*10+rem;
            input/=10;
        }

        System.out.println(rev);
    }
}