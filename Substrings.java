import java.util.*;
import java.lang.Error;

public class Substrings {
    public static void main(String[] rko) {
        String value = "abc";
        int len = value.length();
        
        for(int i=0;i<len;i++){
            System.out.print(value.charAt(i)+" ");
        }
        System.out.println();
        for(int i=0;i<len;i++){          //012
            for(int j=i+1;j<len;j++){   // abc  1 2
                System.out.print(value.charAt(i)+""+value.charAt(j)+" ");
                System.out.print(value.charAt(j)+""+value.charAt(i)+" ");
            }
            System.out.println();
        }

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                System.out.println(value.charAt(i)+""+value.charAt(j)+""+value.charAt(j+1)+" ");
                System.out.println(value.charAt(j)+""+value.charAt(i)+""+value.charAt(j+1)+" ");
                System.out.println(value.charAt(i)+""+value.charAt(j+1)+""+value.charAt(j)+" ");
                // System.out.println(value.charAt(j)+""+value.charAt(i)+""+value.charAt(j+1)+" ");
                // System.out.println(value.charAt(j+1)+""+value.charAt(j)+""+value.charAt(i)+" ");
            }
        }
    }
}