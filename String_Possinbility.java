import java.util.*;
import java.util.Scanner;
import java.lang.Error;

public class String_Possinbility {
    public static void main(String[] rko) {
        String str = "abc";

        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i!=j)  System.out.println(str.charAt(i)+""+str.charAt(j));
               
                //System.out.println();
            }
        }
    }
}
ab
ac
ba
bc
ca
cb
