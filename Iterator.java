import java.util.*;
import java.lang.Error;
import java.util.Iterator;

public class Iterator {
    public static void main(String[] rko) {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add("prakash");
        al.add('a');
        al.add(108);
        al.add(110.10f);
        al.add(7397180390l);
        
        System.out.println(al);

        Iterator<Object> i = al.iterator();
        while(i.hasNext()){
            System.out.println(i);
        }
        
    }    
}
