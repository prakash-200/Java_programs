import java.util.*;
import java.util.Scanner;
import java.lang.Error;

public class Set_ArrayList {
    public static void main(String[] rko) {
    //ArrayList al = new ArrayList();
    Scanner scn = new Scanner(System.in);
    int limit = scn.nextInt();
    // for(int i=0;i<limit;i++){
    //     al.add(scn.nextInt());
    // }
    // System.out.print("Arraylist values : "+al);
    
    Set<Integer> st = new HashSet<Integer>();
    for(int i=0;i<limit;i++) st.add(scn.nextInt());
    System.out.println(st);

    int arr[] = new int[limit];
    arr = st.toArray(arr);
    //int arr[] = st.toArray(new int[st.size()]);
    for(int i=0;i<st.size();i++){
        arr[i] = st.get(i);
    }
    }
}
