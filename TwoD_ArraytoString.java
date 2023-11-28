import java.util.*;
import java.lang.Error;

public class TwoD_ArraytoString {
    public static void main(String[] rko) {
        char board[][] = {{'a','b'},{'c','d'}};
        char arr[] = {'1','2','3','4','5'};
        ArrayList<Character> al = new ArrayList<Character>();
        //int i=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                al.add(board[i][j]);
            }
        }

        System.out.println(al);
        String word = "abcd";
        int count =0;
        for(int k=0;k<word.length();k++){
            char t = word.charAt(k);
            for(int i=0;i<al.size();i++){
            if(al.get(i)==t){
                count++;
                al.set(i,'-');
                break;
            }
        }
        }
        System.out.println(count);
        System.out.println(al);
        if(count==word.length()) System.out.println(true);
        else System.out.println("false");
    }
}
