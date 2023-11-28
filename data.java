import java.util.*;
import java.lang.Error;
import java.io.*;

public class data {
    public static void main(String[] args){
        Record rec = new Record();
        rec.disp();
    }
}

class student{   //student record
    String name;
    String roll_no;
}

class Record extends student{
    String name = "prakash";
    String roll_no = "120uit064";
    void disp(){
        System.out.println("student name:"+name+"  roll number:"+roll_no);
    }
}