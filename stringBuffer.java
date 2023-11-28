import java.util.*;
import java.lang.Error;

public class stringBuffer {
    public static void main(String[] args){
        String arr[] = {"apple","banana","orange","mango"};
        StringBuffer buf = new StringBuffer();

        for(int i=0;i<arr.length;i++){
            buf.append(arr[i]+" ");
        }
        System.out.println(buf.reverse());

        String ex = "kabali is fire";
        String ex2[] = ex.split(" ");
        StringBuffer sbf1 = new StringBuffer();
        StringBuffer sbf2 = new StringBuffer();

        for(int i=0;i<ex2.length;i++){
            sbf1.append(ex2[i]);
            sbf1.reverse();
            sbf2.append(sbf1+" ");
            sbf1.delete(0,sbf1.length());
        }
        String result = sbf2.toString();
        System.out.println(result);

        // String name = "prakashraj";
        // StringBuffer sbf = new StringBuffer(name);
        // sbf.append("raj");
        // System.out.println(sbf.length());

        // String str = buf.toString();

        // System.out.println(str);

        // String s = new StringBuffer().append("sachin").append("tendular").toString();
        // System.out.println(s);

    }
}
