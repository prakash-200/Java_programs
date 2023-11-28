import java.util.*;
import java.lang.Error;
import java.io.*;
public class Quiz {
    public static void main(String[] rko) {
        confirmEmployee ce = new confirmEmployee();
       // ce.confirmEmployee();
    }
}
class confirmEmployee extends employee {
    public void confirmEmployee(){
        System.out.println(1);
    }
}
class employee{
    public void employee(){
        System.out.println(2);
    }
}
