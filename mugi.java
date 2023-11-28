import java.util.Scanner;

public class mugi{
    public static void main(String[]args){
        Scanner sj=new Scanner(System.in);
        int n=sj.nextInt();
        int Even=0;
        int Odd=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem%2==0){
                Even=Even+rem;
            }
            else{
                Odd=Odd+rem;
            }
            n=n/10;
        }
         int diff=Even-Odd;
         System.out.print(diff);

  
    
    }
    }
