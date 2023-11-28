import java.util.*;
import java.util.Scanner;

public class amicable {
    public static void main(String rko[]){
        Scanner scn = new Scanner(System.in);
        int val1 = scn.nextInt();
        int val2 = scn.nextInt();
        int temp1 = 0;
        int temp2 = 0;

        for(int i=1;i<val1;i++){
            if(val1%i==0){
                temp1 = temp1+i;
            }
        }
        //System.out.println(temp1);
        
        for(int i=1;i<val2;i++){
            if(val2%i==0){
                temp2 = temp2+i;
            }
        }
        //System.out.println(temp2);
        if(temp1==val2 && temp2==val1){
            System.out.println("Amicable pair");
        }
        else{
            System.out.println("Not a Amicable pair");
        }
        
    }
}
