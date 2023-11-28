import java.util.*;
import java.lang.Error;
public class Array_Int_NonDup {
    public static void main(String[] rko) {
        String st[] = {"11","12","33","14","15"};
        int len = st.length;
         int result = 0;
        for(int i=0;i<len;i++){
            int count = 0;
            String str = String.valueOf(st[i]);
            for(int j=0;j<str.length();j++){
                String st1 = String.valueOf(str.charAt(j));
                int temp1 = Integer.valueOf(st1);
                for(int k=j+1;k<str.length();k++){
                    String st2 = String.valueOf(str.charAt(k));
                    int temp2 = Integer.valueOf(st2);
                    if(temp1==temp2) count++;
                }
            }
            if(count!=0) result++;
        }
        System.out.println(result);
    }
}
