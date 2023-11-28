import java.util.*;
import java.lang.Error;
public class TwoD_Array {
    public static void main(String[] rko){
    char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
    String word = "ABCCED";
    for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
        int len = word.length();
        int count = 1;
        for(int h=0;h<len;h++){
            char temp = word.charAt(h);
            for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==temp){
                    count++;
                    board[i][j]='-';
                    break;
                }
            }
            //if(count!=1) break;
        
        }
        }
        System.out.println(count);
        if(count==len) System.out.println("true");
        else System.out.println("false");

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
