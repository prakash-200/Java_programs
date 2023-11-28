import java.util.*;
import java.lang.Error;

public class StringsMerge {
    public static void main(String[] rko) {
        String word1 = "abcde";
        String word2 = "pqr";
        String result = "";

        // int len = (word1.length()>word2.length())?word1.length():word2.length();
        // System.out.println(len);

        // for(int i=0;i<word1.length();i++){
        //     for(int j=i;j<=i;j++){
        //         result = result+word1.charAt(i)+""+word2.charAt(j);
        //     }
        // }

        for(int i=0;i<word1.length() || i<word2.length();i++){
            if(i<word1.length()) result = result+word1.charAt(i);
            if(i<word2.length()) result = result+word2.charAt(i);
        }
        System.out.println(result);
    }
}
