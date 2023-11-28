import java.util.*;
import java.lang.Error;

public class Staircase {
    public static void main(String[] rko) {
        int val = 6,count = 1;
        while(val>0){
            count++;
            val = val-count;
        }
        System.out.println(count-1);
    }
}
