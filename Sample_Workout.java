import java.util.*;
import java.lang.Error;

public class Sample_Workout {
    public static void main(String[] rko) {
        String s = "b10k_@:4a";
        String temp = "";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) temp = temp+s.charAt(i);
        }
        int num = Integer.parseInt(temp);
        System.out.print(num);
        }
}
