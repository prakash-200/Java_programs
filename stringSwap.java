import java.util.*;
import java.lang.Error;

public class stringSwap {
    public static void main(String args[]){
        String str = "mahendra college";
        int len1 =  str.length();
        String emp = " ";
        int len = str.length();

        for(int i=0;i<len;i++){
            /*if(str.charAt(i)==emp.charAt(str.length()-1)){
                System.out.print(emp+" ");
            }*/
            System.out.print(str.charAt(len1-1)+" ");
            len1--;
        }
    }
}
