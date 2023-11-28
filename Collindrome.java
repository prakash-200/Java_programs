import java.util.*;
import java.lang.Error;
import java.util.Arrays;

public class Collindrome {
    public static void main(String suryaramasamy[]) {
        String str = "praarpkesseksussus";
        int len = str.length();
        int count = 0;
        int check = len/6;
        for(int i=0;i<len;i+=6){
            String s = "";
            String r = "";
            int a = 0;
            a = i+3;
            for(int j=i;j<a;j++){
                s = s+str.charAt(j);
            }
           // System.out.println(s);
            for(int k=a;k<a+3;k++){
                r = str.charAt(k)+r;
            }
            // System.out.println(s);
            // System.out.println(r);
            // System.out.println(check);
            // // char c[] = s.toCharArray();
            // char c1[] = r.toCharArray();
            // Arrays.sort(c);
            // Arrays.sort(c1);
            // // System.out.println(c);
            // System.out.println(c1);
            // for(int z=0;z<c.length;z++){
                if(s.equals(r)) count++;
            }
            //System.out.println(count);
       // }

        if(count==check) System.out.println("collindrome");
        else System.out.println("not collindrome");
    }    
}









