import java.util.*;
import java.lang.Error;
import java.io.*;

public class overload {
    public static void main(String[] args){
    child ch  = new child();
    ch.demo();
    }
}

class parent{
    String str = "java";
    void demo(){
        System.out.println(str);
    }
}

class child extends parent{
    //String str = "inherited";
    String str = "language";
   void demo(){
        System.out.println(str);
    }
}
