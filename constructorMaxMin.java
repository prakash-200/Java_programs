import java.util.*;
import java.lang.Error;
import java.io.*;
import java.util.Scanner;

public class constructorMaxMin {
    public static void main(String[] args){

        
        //int min,max;
        Scanner scn = new Scanner(System.in);
        System.out.print("enter two values:");
        int val1 = scn.nextInt();
        int val2 = scn.nextInt();
       
        initial in = new initial(val1,val2);
        

        //in.operation();
       // in.dispMin();
        //in.dispMax();

        //System.out.println(val1+val2);

        
        /*display dsp = new display();
        dsp.displayMax(max,min);
        dsp.displayMin(max,min);*/
        

        }
}

class initial{

     void initial(int val1,int val2){
       this.val1=val1;
       this.val2=val2;
        System.out.println("hi");
     }
    
     /*void operation(){
        if(val1>val2){
            max=val1;
        }
        else{
            min=val1;
        }

        if(val1<val2){
            max=val2;
        }
       else{
        min=val2;
        }*/
     
        
        void dispMax(){
            System.out.println(val1);
           // System.out.println("minimum value:"+max);
        }
    
        void dispMin(){
            System.out.println(val2);
            //System.out.println("minimum value:"+min);
        }
    
    } 


