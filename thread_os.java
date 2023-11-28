import java.util.*;
import java.lang.Error;

public class thread_os { 
    public static void main(String args[]){  // here the output are given by thee lap operating system
        Working wk  = new Working();
        System.out.println(wk.getName());
        System.out.println(wk.getId());
        wk.setName("prakash");
         //System.out.println(wk.setName("prakash"));
        System.out.println(wk.getName());
    }   
}

class Working extends Thread{

}
