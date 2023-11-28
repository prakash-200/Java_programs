import java.util.*;
import java.lang.Error;

public class RevWordinString {
    public static void main(String[] rko) {
        String str = "hello am a coder and designer at mahendra enginnering college till 9years of experience in the field";
        //String str2 = " ";
        String str3 = " "+str+" ";
        System.out.println(str3.length());

        for(int i = str3.length()-1;i>=0;i--){
            //int temp = 0;
            if(str3.charAt(i)==32){
                //temp = i;
                 for(int j=i-1;j>=0;j--){
                    if(str3.charAt(j)==32){
                        for(int k=j+1;k<i;k++){
                            System.out.print(str3.charAt(k));
                        }
                        System.out.print(" ");
                        break;
                    }
                 }
            }
            //System.out.println();
        }
    }
}



