import java.util.*;
import java.util.Scanner;

public class String_maxOccur_Char {
    public static void main(String[] rko) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();  // prakashraj
        int len = str.length();
        int arr[] = new int[len];

        for(int i=0;i<len;i++){
            int count=1;
            for(int j=i+1;j<len;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    arr[j] = -1;
                }
            }
            if(arr[i]!=-1) arr[i] = count;
        }

        //for(int res:arr) System.out.println(res);

        int temp = 0;
        for(int i=0;i<len;i++){
                if(arr[i]>temp) temp = arr[i];
        }
        //System.out.println(temp);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==temp) System.out.println(str.charAt(i)+"="+arr[i]+"times");
        }
    }
}
// 1 p
// 2 r
// 3 a
// 1 k
// -1 a
// 1 s
// 1 h
// -1 r
// -1 a
// 1 j