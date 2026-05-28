class A {
    
    public A(){
        System.out.println(10);
    }
}

class B extends A{
    public B(){
        super();
        System.out.println(13);
    }
}

public class classes{
public static void main(String[] args){
B obj = new B();
}
}