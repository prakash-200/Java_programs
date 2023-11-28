import java.util.*;
import java.lang.Error;
import java.lang.String;
public class Array_SmallestChar {
    public static void main(String[] rko) {
        char arr[] = {'h','j','y','t','u'};
        char target = 'z';
        ArrayList<Character> al = new ArrayList<Character>();
        for(char ch:arr) al.add(ch);
        Collections.sort(al);

        char str = Character.valueOf(al.get(0));
        System.out.println((str>target)?str:target);

        
    }
}
