import java.util.*;
import java.lang.Error;
public class toogle {
    public static void main(String[] rko) {
        String str = "India123";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>57){
                if(Character.isUpperCase(str.charAt(i))){
                    System.out.print(Character.toLowerCase(str.charAt(i)));
                }
                else System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }
    }
}
