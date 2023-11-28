import java.util.*;
import java.util.Scanner;

public class intPrime {
    public static void main(String rko[]){
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        int temp = val;
        int rem = 0;
        //int res = 0;

        while(temp!=0){
            rem = temp%10;
            temp = temp/10;
                                                          // 1 2 3 4 5 
            if(rem==2 || rem==3 || rem%4==1 && rem%5==1 && rem%6==1 && rem%7==1 && rem%8==1 && rem%9==1 && rem%10==1){
                System.out.print(rem+" ");
            }
            else{
                System.out.println(rem+" ");
            }
        }
    }
}
