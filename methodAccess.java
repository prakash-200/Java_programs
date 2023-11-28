import java.util.*;
import java.lang.Error;

public class methodAccess {
    public static void main(String args[]){

        access acs = new access();
        
        System.out.println(acs.met2(10,10));
    }    
}

class access{
    //int x,y,z;
    int met1(int z){
        System.out.println("access method-1");
      // System.out.println(z);
      return z;
    }
    int met2(int x,int y){
        
          int z=x+y;
        System.out.println("access method-2");
        met1(z);
        System.out.println(z);
        return z;
        
    }
}
