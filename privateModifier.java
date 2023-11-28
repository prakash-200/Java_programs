import java.util.*;
import java.lang.Error;
//import java.lang.String;

class privateModifier{
    public static void main(String args[]){

        secondary second = new secondary();
        second.valueAssign(10);
        secondary second1 = new secondary();
        System.out.println(second1.valueReturn());
    }
}

class secondary{
    //private String name= "hello world";
    private int value =  103;
   
    public void valueAssign(int x){
        this.value=x;
    }

    public int valueReturn(){
        return value;

    }
}