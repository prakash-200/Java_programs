import java.util.*;
import java.util.Scanner;

public class hackerQn {
    public static void main(String rko[]){
        Scanner scn = new Scanner(System.in);
        int val1 = scn.nextInt();
        int val2 = scn.nextInt();
        int temp = val1;
        int rem = 0;
        int count = 0;

        while(temp!=0){
            rem = temp%10;
            temp = temp/10;
            if(rem==val2){
                count++;
            } 
        }
        System.out.println(count);
    }
}
