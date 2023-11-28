import java.util.*;
import java.lang.Error;
import java.util.Arrays;

class anagram{

public static void main(String[] args){
    String str1 = "race";
    String str2 = "care";
    boolean bool = true;

    if(str1.length()!=str2.length()){
        bool = false;
    }
    else{
        char ch1[] = str1.toCharArray();
        Arrays.sort(ch1);
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch2);
        bool=Arrays.equals(ch1,ch2);

    }

    if(bool){
        System.out.println("anagram");
    }
    else{
    System.out.println("nota an anagram");
}

}
}