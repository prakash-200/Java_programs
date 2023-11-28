import java.util.*;
import java.util.Scanner;
import java.lang.Error;

public class PalindomeinString {
    public static void main(String[] rko) {
        String str = "my dad and mom knows malayalam at hight level";
        //int len = str.length();
        String rev = " "+str+" ";
        //String temp = "";

        for(int i=0;i<rev.length();i++){
            String temp = "";
            String comp = "";
            if(rev.charAt(i)==32){
                for(int j=i+1;j<rev.length();j++){
                    
                    if(rev.charAt(j)==32) {
                        for(int k=i+1;k<=j-1;k++) temp = temp+rev.charAt(k);
                        for(int l=0;l<temp.length();l++){
                            comp = temp.charAt(l)+comp;
                        }
                        if(temp.equals(comp)) System.out.println(temp);
                        break;
                    }
                }
            }
            //System.out.print(comp);
        }
        //System.out.println(rev);
   }
}
//  i

//  ma


//  dad



//  dna



//  mom


