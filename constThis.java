import java.util.*;
import java.lang.Error;

public class constThis {
    public static void main(String args[]){
        //second snd = new second(10,10);
        second sd = new second();
        second snd1 = new second("prakash",20,"it");

      // second sd = new second();
       //sd.display();
    }    
}

class second{
    int x;
    int y;

    String name;
    int age;
    String dept;

    second(){
        
        System.out.println("no args constructor");
    }

     second(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println(x+y);

        this.display();
     }

     second(String name,int age,String dept){

        this();

        this.name=name;
        this.age=age;
        this.dept=dept;

        System.out.println("your name:"+name);
        System.out.println("your age:"+age);
        System.out.println("your dept:"+dept);

        
     }

     void display(){
        
        System.out.println("display method");
        
     }
}
