import java.util.*;
import java.lang.Error;

public class stringCount {
    public static void main(String[] args){
        String str = "mahendra engineering college";
        int len = str.length();
        String emp = " ";       //word count in string 
        int count=1;

        for(int i=0;i<len;i++){
            if(str.charAt(i)==emp.charAt(0)){
                count++;
            }
        }
        System.out.print(count);
    }
}
