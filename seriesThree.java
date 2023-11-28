import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class seriesThree {
    public static void main(String[] args){
        int temp = 0;
        int res = 0;
        System.out.print("Enter a value:");
        Scanner scn = new Scanner(System.in); // 0 1 3 6 10 15 series program
        int val = scn.nextInt();

        for(int i=0;i<val;i++){
            res = res+temp;
            System.out.print(res+" ");
            temp++;

        }

    }
}
