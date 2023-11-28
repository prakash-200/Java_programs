import java.util.*;
public class IntegerDupCount {
    public static void main(String[] rko) {
        int num = 356562431;
        String str = String.valueOf(num);
        int len = str.length();
        int temp[] = new int[len];
        int res[] = new int[len];

        //System.out.println(str.charAt(2));
        for(int i=0;i<len;i++){
            temp[i] = str.charAt(i);
        }

        System.out.println(str);

        for(int i=0;i<len;i++){
            int count = 0;
            for(int j=i+1;j<len;j++){
                if(temp[i]==temp[j]){
                    count++;
                    temp[j]=-1;
                }
            }
            if(res[i]!=-1){
                res[i]=count;
            }
        }

        // for(int i=0;i<len;i++){
        //     if(res[i]!=-1){
        //         System.out.print(temp[i]+" "+res[i]+" times");
        //     }
        //     System.out.println();
        // }
    }
}
