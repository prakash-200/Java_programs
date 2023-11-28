import java.util.*;
import java.lang.Error;
import java.util.Arrays;

public class StringConvfromArray {
    public static void main(String[] rko) {
        int array[] = new int[]{1,2,3,4,5,6};
        String str="";

        //str=Arrays.toString(array);

        for(int i=0;i<array.length;i++){
            str+=array[i];
        }
        System.out.println(str);
        System.out.println(str.charAt(2));
    }
}
