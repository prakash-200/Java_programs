import java.util.*;
import java.lang.Error;
import java.util.Arrays;
import java.util.Scanner;

public class CrossMatrix {
    public static void main(String[] rko) {
        //int k=1;
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int arr[][] = new int[row][col];

        for(int i=0;i<row;i++){               //00 01 02
            for(int j=0;j<col;j++){          // 11 12 13
                arr[i][j] = scn.nextInt();  //  21 22 23
            }
        }

        for(int i=2;i<=row+3;i++){
            //int k=1;
            for(int j=1;j<i-1;j++){
                
                if(i!=1 && j!=1 ){
                    System.out.println(arr[i][j]);
                    System.out.println(arr[i-1][j+1]);
                }
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

        // for(int arr1[]:arr){
        //     for(int res:arr1){
        //         System.out.print(res);
        //     }
        // }
    }
}
