import java.util.*;
import java.lang.Error;

public class Collection {
    public static void main(String[] rko) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Character> sl = new ArrayList<Character>();
        Set<Character> s = new HashSet<Character>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        System.out.println(al.size());

        String str ="malayalam";
        for(int i=0;i<str.length();i++) sl.add(str.charAt(i));
        System.out.println(sl);
        for(int i=0;i<str.length();i++) s.add(str.charAt(i));
        System.out.println(s);

        
        
    }
}
