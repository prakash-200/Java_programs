import java.util.*;
import java.lang.Error;

public class Lambda_exp {
    public static void main(String[] rko) {
        Hello hl = new Hello();
        hl.sum();
    }
}

@FunctionalInterface
interface Demo{
    public abstract void sum();
}

class Hello implements Demo{
    public void sum(){
        System.out.println("hi");
    } 
}