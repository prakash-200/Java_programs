public class super {
    public static void main(String[] args){
        child child = new child();
        child.print();

    }
}

class child extends parent{
    void print(){
        System.out.println(str);
    }

}

class parent{
    String str ="prakash";
}

}
