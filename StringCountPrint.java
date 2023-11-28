import java.util.*;
import java.lang.Error;

public class StringCountPrint {
    public static void main(String[] rko) {
        String str1 = "banana";
        //String str2 = str1;
        System.out.println(str1);
        //char s[] = str1.toCharArray();
       // int str1[] = new int[str1.length()];

        for(int i=0;i<str1.length();i++){
            int count = 0;
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(i)==str1.charAt(j)){
                   count++;
                } 
                
            }
            if(count!=0){
                for(int k=0;k<count;k++){
                    System.out.print(str1.charAt(i));
                }
            }
        }
    }
}
