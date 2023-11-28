import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class username_check {
    public static void main(String[] rko){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a username:");
        String user = scn.nextLine();
        //int temp = 0;
        int i = 0;

        System.out.println(user.charAt(i));
            if(user.charAt(i)>=65 || user.charAt(i)<=90){
                System.out.println("valid");
            }
        
    }
}
