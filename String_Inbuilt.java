import java.util.*;
import java.lang.Error;
import java.lang.String;

public class String_Inbuilt {
    public static void main(String[] rko) {
          String str = "[1,2,3,4,5,%$,!,&,ab,c,g,f,null,e]";
        str = str.replaceAll("[,a]]","");
        System.out.println(str);
        
        // String str = "welcome to java to";
        // String str2 = "welcome to python";

        // System.out.println("indexof : "+str.indexOf("o"));

        // String sp[] = str2.split(" ");
        // System.out.println("split : "+Arrays.toString(sp));
        // System.out.println(sp[1].length());

        // String rp = str.replaceAll(" ","%"); 
        // System.out.println("replaceAll : "+rp);

        // // String rp = str.replace("w","+"); 
        //  // System.out.println("replaceA : "+str.replace("w","+"));
        
        
        // //String ss = str.subSequence(0,4); 
        // System.out.println("subSequence : "+str.subSequence(0,4));
        
        // String ss = str.substring(6); 
        // System.out.println("substring : "+ss);

        // long  num = 7397180390l;
        // String valof = String.valueOf(num);
        // System.out.println("valueOf : "+valof);

      
    }
}
