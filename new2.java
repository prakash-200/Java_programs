import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Error;

public class new2
 {
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    int c = scn.nextInt();

    int input = 1234;
    char[] digits = String.valueOf(input).toCharArray();

    for(int val:digits){
        System.out.println(val);
    }
}
 }