import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class integerSum {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a value:");
        int input = scan.nextInt();
        int temp;
        int res=0;

        while(input>0){
            temp=input%10;
            res=res+temp;
            input/=10;

        }
        System.out.println(res);
    }
}
