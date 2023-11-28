import java.util.*;
import java.lang.Error;

public class Int_Digits_Add {
    public static void main(String[] rko) {
        int n = 990989;
        int add = 0;

        if(n==0) System.out.println(0);
        
            while(n>0){
                System.out.println("n value : "+n);
                int num = n%10;
                System.out.println("num value : "+num);
                add = add+num;
                System.out.println("add value : "+add);
                n = n/10;
            }
        
            System.out.println(add);
    }
}
