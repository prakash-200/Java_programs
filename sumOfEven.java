import java.util.*;
import java.util.Scanner;
import java.lang.Error;

public class sumOfEven {
public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int limit = scn.nextInt();
    int temp=0;

    for(int i=0;i<=limit;i+=2){
        temp=temp+i;
    }
    System.out.println(temp);
}
}
