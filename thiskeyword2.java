import java.util.*;
import java.lang.Error;

public class thiskeyword2 {
    public static void main(String args[]){
        another ant = new another();
        ant.disp(10,100.0f);
    }
}

class another{
    int x;
    float y;
    void disp(int x,float y){
        System.out.println(x+y);
    }

}
