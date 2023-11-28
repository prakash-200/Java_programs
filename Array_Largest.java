import java.util.*;
import java.lang.Error;

public class Array_Largest {
    public static void main(String[] rko) {
        int num[] = {54,546,548,60};
        int len = num.length;
        String temp[] = new String[len];

        for(int i=0;i<len;i++){
            temp[i] = String.valueOf(num[i]);
        }

        Arrays.sort(temp,(a,b) -> (b+a).compareTo(a+b));

        System.out.println("sorted temp : "+Arrays.toString(temp));
        
        String result = "";
        
        for(String str:temp) result = result+str;
        System.out.println("sorted res : "+result);

        }
}
