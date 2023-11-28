import java.util.*;
import java.lang.Error;

public class Array_difference {
    public static void main(String[] rko) {
        String s= "ae";
        String t= "aea";
       // String m = 
       char result = Character.MIN_VALUE;
       String mg = s+t;
       System.out.println(mg);
       char ch1[] = mg.toCharArray();
       System.out.println(Arrays.toString(ch1));

       for(int i=0;i<ch1.length;i++){
           for(int j=i+1;j<ch1.length;j++){
               if(ch1[i]==ch1[j] && ch1[i]!=0 && ch1[j]!=0){
                   ch1[i]='0';
                   ch1[j]='0';
                   break;
               }
           }
       }
       String res = "";
       for(int i=0;i<ch1.length;i++){
        char ch = ch1[i];
           if(ch!='0'){
            System.out.println("executed");
            System.out.println(ch);
               res = String.valueOf(ch1[i]);
               break;
           } 
       }
       System.out.println(Arrays.toString(ch1));
       
       System.out.println(res); 
    }
}
