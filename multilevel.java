import java.util.*;
import java.lang.Error;
import java.io.*;

public class multilevel {
    public static void main(String[] args){

        child ch = new child();
        ch.disp();
        ch.print();
    }
}

interface parent{
    void disp();
    void print();
}

class child implements parent{
    void disp(){
        System.out.println("interface parent disp method");
    }
     void print(){
        System.out.println("interface parent print method");
    }
}
