import java.util.*;
import java.lang.Error;
import java.io.*;

public class methodOverriding {
    public static void main(String[] args){
        ovrrd2 obj = new ovrrd2();
        obj.disp();

    }
}

class ovrrd{
    void disp(){
        String str = "java";
        System.out.println(str);
    }
}

class ovrrd2 extends ovrrd{
    void disp(){
        String str = "overrided";
        System.out.println(str);
    }
}
