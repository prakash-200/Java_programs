class outer{
    int val1=10;
    class inner1{
        int val2=20;
        class inner2{
            int val3=30;
        }
    }

}

public class nestedClass {
    public static void main(String[] args){
        outer out = new outer();
        outer.inner1 inn=out.new inner1();
        outer.inner1.inner2 in=inn.new inner2();

       System.out.println(out.val1+" "+in.val3+" "+inn.val2);


    }
}


