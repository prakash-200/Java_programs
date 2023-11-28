import java.util.*;
import java.lang.Error;
import java.util.Scanner;

public class String_CompareWords {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    
    String s[] = str.split(" "); 
    String temp1 = String.valueOf(s[0]);
    String temp2 = String.valueOf(s[1]);

    System.out.println(temp1);
    System.out.println(temp2);

    // if(s.length==2){
        for(int i=0;i<temp1.length();i++){
        for(int j=i;j<temp1.length();j++){
            if(i<temp2.length()){
                System.out.print(temp1.charAt(i)+""+temp2.charAt(j));
                break;
            }
            else{
                System.out.print(temp1.charAt(i));
                break;
            } 
            //break;
        }
     }
    // }

    

    // String str2[] = str.split("_");
    // System.out.print(Arrays.toString(str2));

    // String temp1
    
    // for(int i=0;i<str2.length;i++){
    //     for(int j=0;j<str2.length;j++){
    //         if
    //     }
    // }
    }
    
}
