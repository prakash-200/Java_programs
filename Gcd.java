import java.util.*;
import java.lang.Error;

public class Gcd {
    public static void main(String[] rko) {
        int x=6;
        int y=12;
        int gcd = 1;

        for(int i=1;i<=x && i<=y;i++){
            if(x%i==0 && y%i==0) gcd=i;
        }
        System.out.println(gcd);
            }
}
