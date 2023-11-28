import java.util.*;
import java.lang.Error;
import java.io.*;

public class methodOverload {
    public static void main(String[] args){
        ovrld ovr = new ovrld();
        int val=10;
        ovr.demo(10);

    }
}

class ovrld{
    void demo(int x,int y){
        int z=0;
        z=x+y;
        System.out.println(z);
    }

    void demo(int x,int y,int a){
        int z=0;
        z=x+y+a;
        System.out.println(z);
    }

    void demo(int x){
        System.out.println(x);
    }


}
