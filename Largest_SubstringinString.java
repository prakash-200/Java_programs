import java.util.*;
import java.lang.Error;

public class Largest_SubstringinString {
    public static void main(String[] rko) {
        String str ="abaabdhshgbd";
        String res[] = new String[str.length()];

        for(int i=0;i<str.length();i++){
            String s = null;
            String v = null;
            s = String.valueOf(str.charAt(i));
            for(int j=i+1;j<str.length();j++){
                for(int k=i;k<=j;k++){
                    if(str.charAt(k)!=str.charAt(j)){
                        v = s+str.charAt(j);
                    }
                    else break;
                }
                break;
            
                    
                
            }
            res[i] = v;
        }
        System.out.println(Arrays.toString(res));
    }
}
