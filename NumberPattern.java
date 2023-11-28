import java.util.*;
import java.util.Scanner;
import java.lang.Error;

public class NumberPattern {
     public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        int limit = scn.nextInt();
        Example ex = new Example();
        ex.logic(limit);
    }    
}
class Example{
    int limit = 0;
    public void logic(int limit){
        int num = limit;
        limit = limit+5;
        for(int i=0;i<limit;i++){
            for(int j=i;j<limit-1;j++){
                if()
            }
        }
    }
}
