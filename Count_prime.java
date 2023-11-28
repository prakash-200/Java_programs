import java.util.*;
import java.lang.Error;

public class Count_prime {
    public static void main(String[] rko) {
        int n = 10;
        int result = 0;
        if(n==0 || n==1) result = 0;
        else if(n==2 || n==3) result = 1;
        else{
                //result+=1;
            for(int i=2;i<=n;i++){
                //if(i==2 || i==3) result++;
                if( i!=n && n%5!=0 && n%11!=0) result++;
            }
        }

        System.out.println(result); 
    }
}
