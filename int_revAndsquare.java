import java.util.*;
import java.lang.Error;

public class int_revAndsquare {
    public static void main(String rko[]){
        int num = 12345;
        int res = 0;
        int temp=0;
        

        while(num!=0){
            res = num%10;
            num = num/10;
            temp = res;
            System.out.print(temp*temp);
        }
        }
}
