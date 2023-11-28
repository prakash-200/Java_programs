import java.util.*;
import java.util.Scanner;
import java.lang.Error;

public class DiamondPattern {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int limit = scn.nextInt();
        working wk = new working();
        wk.log(limit);
    }
}
class working{
    int limit = 0;
    public void log(int limit){
        for(int i=0;i<limit;i++){
            for(int j=i;j<=limit-2;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                    System.out.print("* ");
                }
            System.out.println();  
        }

        for(int i=0;i<=limit-2;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=limit-2;k++){   // 0 1 2 3
                //for(int l=k;l<limit-2;l++){
                    System.out.print("* ");
               // }
               // System.out.println();
            }
            System.out.println();
        }
    } 
}
//     *
//    * *
//   * * * 
//  * * * *
// * * * * * 
//  * * * *
//   * * *
//    * *
//     * 