import java.util.*;
import java.lang.Error;
public class StringToStringCheck {
    public static void main(String[] rko) {
        String s = "ab";
        String t = "baab";
        int count = 0;
        int ind = 0;
        for(int m=0;m<s.length();m++){
            char c = s.charAt(m);
        for(int i=ind;i<t.length();i++){
            if(c==t.charAt(i)){
                ind = i+1;
                count++;
                break;
                //m++;
            }
            else if(count==s.length()) break;
            //else break;
        }

        }
        System.out.println(count);
        if(count==s.length()) System.out.print("true");
        else System.out.print("false");
 
    }
}
