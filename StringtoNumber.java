import java.util.*;
import java.lang.Error;

public class StringtoNumber {
    public static void main(String[] rko) {
        String phone[] = {"triple","three","nine","dOuBlE","one","eight","double","three","nine","zero"};
        // String phone[] = {"triple","one","two"};

        int count = 0;
        for(int z=0;z<phone.length;z++){
            String temp = String.valueOf(phone[z]);
            if(temp.equalsIgnoreCase("double")){
                count+=1;
                // System.out.println("double : "+count);
            }
            else if(temp.equalsIgnoreCase("triple")){
                count+=2;
                // System.out.println("triple : "+count);
            }
            
            switch(temp){

                case "one":
                for(int i=0;i<=count;i++){
                    System.out.print("1");
                }
                count=0;
                break;
                case "two":
                for(int j=0;j<=count;j++){
                    System.out.print("2");
                }
                count=0;
                break;
                case "three":
                for(int k=0;k<=count;k++){
                    System.out.print("3");
                }
                count=0;
                break;
                case "four":
                for(int l=0;l<=count;l++){
                    System.out.print("4");
                }
                count=0;
                break;
                case "five":
                for(int m=0;m<=count;m++){
                    System.out.print("5");
                }
                count=0;
                break;
                case "six":
                for(int n=0;n<=count;n++){
                    System.out.print("6");
                }
                count=0;
                break;
                case "seven":
                for(int o=0;o<=count;o++){
                    System.out.print("7");
                }
                count=0;
                break;
                case "eight":
                for(int p=0;p<=count;p++){
                    System.out.print("8");
                }
                count=0;
                break;
                case "nine":
                for(int q=0;q<=count;q++){
                    System.out.print("9");
                }
                count=0;
                break;
                case "zero":
                for(int r=0;r<=count;r++){
                    System.out.print("0");
                }
                count=0;
                break;
            }
        }
    }
}
