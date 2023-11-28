import java.util.*;
import java.lang.Error;
import java.util.Scanner;
import java.util.Arrays;

public class Password {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 8 digit password");
        String password = scn.nextLine();
        String val = find(password);
        System.out.println(val);
    }
    public static String find(String password){
        int len = password.length();
        int caps = 0,sml = 0,spl = 0,num = 0;
        if(len!=8){
            return "false";
        }
        else{
            for(int i=0;i<len;i++){
                if(password.charAt(i)>=65 && password.charAt(i)<=90) caps++;
                if(password.charAt(i)>=97 && password.charAt(i)<=122) sml++;
                if(password.charAt(i)>=48 && password.charAt(i)<=57) num++;
                if(password.charAt(i)>=33 && password.charAt(i)<=47) spl++;
            }
            System.out.println(caps);
            System.out.println(sml);
            System.out.println(num);
            System.out.println(spl);
            
            if(caps!=0 && sml!=0 && spl!=0 && num!=0) return "true";
             return "false";
        }
 
    }
}



    
  
