import java.util.*;
import java.lang.Error;

public class thisKeyword {
    public static void main(String args[]){
        thisKeyword ts = new thisKeyword();
       // ts.disp();
        //ts.temp();

       // another an = new another();
        //an.met2();

        secondary snd = new secondary();
        snd.sec1();

          
    }

    void disp(){
        System.out.println("display method");
    }

    void temp(){
        System.out.println("temporary method");
        this.disp();
    }
}

class another{
    void met1(){
        System.out.println("Another class method 1");
    }

    void met2(){
        System.out.println("Another class method 2");
        this.met1();
    }

}

class secondary extends another{
    void sec1(){
        this.met2();
    }
}