import java.util.*;
import java.lang.Error;

public class Generic {
    public static void main(String[] rko) {
        int num[] = {1,2,3,4,5,6};
        char ch[] = {'a','b','c','d','e','f'};
        float ft[] = {11.1f,22.2f,33.3f,44.4f,55.5f,66.6f};
        String str[] = {"prakash","santhosh","nath","subash","parasu","dharaanish"};
        action(num);
    }
}
class sub{
    public static <G> void action(G[] arr){
        for(G g:arr){
            System.out.println("%s",g);
        }
    }
}
