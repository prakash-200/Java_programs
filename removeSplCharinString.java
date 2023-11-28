import java.util.*;
import java.lang.Error;

public class removeSplCharinString {
    public static void main(String args[]){
        String str = "pr2aka@&s4HR#@aJ90";
        String res = " ";

        /*for(int i=0;i<str.length();i++){
            if(str.charAt(i)>64 && str.charAt(i)<122){ //first method
                res = res+str.charAt(i);

            }
        }*/
        for(int i=0;i<str.length();i++){        //second method
            if(str.charAt(i)>64){
                res = res+str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
