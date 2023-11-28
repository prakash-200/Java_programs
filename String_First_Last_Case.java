import java.util.*;
import java.lang.Error;

public class String_First_Last_Case {
    public static void main(String[] args) {
    String str = "hello world to java";
    String s[] = null;

    s = str.split(" ");

    System.out.println(Arrays.toString(s));
    for(int i=0;i<s.length;i++){
        String c =" ";
        c = s[i];
        for(int j=0;j<c.length();j++){
            int len = c.length();
            if(j==0 ){
                char ch1 = Character.toUpperCase(c.charAt(0));
                System.out.print(ch1);
                
            }
            else if(j==c.length()-1){
                char ch2 = Character.toUpperCase(c.charAt(c.length()-1));
                System.out.print(ch2+" ");
            }
            else{
                System.out.print(c.charAt(j));
            }
            
        }
        
    }
}

}