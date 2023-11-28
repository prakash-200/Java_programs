import java.util.*;
import java.util.Scanner;
    class armstrong{
      public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int num = scn.nextInt();

        String str = String.valueOf(num);
        int len = str.length();
        double result = 0;

        
        for(int i=0;i<len;i++){
            int num2 = str.charAt(i)-'0';
            result = result+Math.pow(num2,len);
        }
        if(num == result) System.out.println("Given number is Armstrong");
        else System.out.println("not an Armstrong number");
      }
    }
