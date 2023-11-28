import java.util.*;
import java.lang.Error;
public class Array_Rotation {
    
static void RightRotate(int a[],
int len, int k)
{

k=k%len;

for(int i = 0; i < len; i++)
{
if(i<k)
{
System.out.print(a[len + i - k]+ " ");
}
else
{
System.out.print(a[i - k]+ " ");
}
}
System.out.println();
}

public static void main(String args[])
{
int Array[] = {1,2,3,4,5,6,7};
int N = Array.length;

int K = 3;
RightRotate(Array, N, K);

}

}
