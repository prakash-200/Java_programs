import java.util.*;
import java.lang.Error;

public class abstract_ex {
    public static void main(String args[]){
        Rewrite rew = new Rewrite();
        rew.show();
        rew.disp();
        rew.set();
    }
}

abstract class Demo{
    abstract void show();
    void disp(){
        System.out.println("Abstract class method with properties !!!");
    }
    void set(){
        System.out.println("set method");
    }
}

class Rewrite extends Demo{
    
    void show(){
        System.out.println("Abstract class rewrittened !!!");
    }
}
