import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int len = str.length();
        String str2  = "";
        char ch;

        for(int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            str2 = str2+ch;
        }
        System.out.print(str2);

        if(str.equals(str2)) System.out.println("palindrome");
        else System.out.print("not palindrome");
    }
}
