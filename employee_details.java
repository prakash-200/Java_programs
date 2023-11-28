import java.util.*;
import java.lang.Error;
import java.util.Arrays;
import java.util.Scanner;

public class employee_details {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String empName = scn.nextLine();
        System.out.println("Enter employee salary:");
        int salary = scn.nextInt();

        print_details(empName,salary);

        static void print_details(String empName,int salary){
            static int empCount=1;
            int empId = 01;
            System.out.println(empName);

        }

    }
}
