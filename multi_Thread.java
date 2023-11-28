import java.util.*;
import java.lang.Error;

public class multi_Thread {
    public static void main(String rko[]){  // thread are happen in operating system 
        example ex = new example();         // here the program indicates the multiple tasks are handledd by os
        ex.start();
        example ex1 = new example();
        ex1.start();
    }
}

class example extends Thread{
    public void run(){
       for(int i=0;i<=10;i++){
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(i);
       }
    }
}
