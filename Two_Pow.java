import java.util.*;
import java.lang.Error;
public class Two_Pow {
    public static void main(String[] rko) {
        int n =8;
        int temp = 2;
        boolean result = false;
        if(n==1){
            result = true;
        }
        else{
            for(int i=0;i<n;i++){
            temp = (int)(temp*2);
            System.out.println(temp);
            if(temp==n){
                result = true;
                break;
            } 
            else if(temp>n) break;
        }
        }
 System.out.println(result);
    }
}
