import java.util.*;
import java.util.Arrays;

public class charArray {
    public static void main(String rko[]){
        String str = "hello world";
        char ch[];

        ch = str.toCharArray();  
        Arrays.sort(ch); 
    for(int i=0;i<ch.length;i++){
        System.out.print(ch[i]+""+ch[i+1]+" ");
        
    }
    }
}
