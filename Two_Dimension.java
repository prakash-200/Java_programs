import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class Two_Dimension {
    public static void main(String[] rko) {
        int num[][] = new int[3][3];
        Scanner scn = new Scanner(System.in);
        

        for(int i=0;i<3;i++){             //  0 1 2
            //int n = scn.nextInt();        //  0 1 2
            //int j = n;  
            for(int j=0;j<3;j++){
                System.out.println("enter value "+i+" row "+j+" column : ");
                 num[i][j] = scn.nextInt();
            }                //  0 1 2
           
        }

        System.out.println("the value is:"+num[0][2]);
    }
}
