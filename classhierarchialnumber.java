import java.util.*;

public class classhierarchialnumber {
    
    protected int n;

    classhierarchialnumber(int num){
        n = num;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Square s = new Square(n);
        Cube c = new Cube(n);

        s.cal();
        c.cal();
    }
}

class Square extends classhierarchialnumber{
    Square(int num){
        super(num);
    }   
    void cal(){
        System.out.println(n * n);
    }
}

class Cube extends classhierarchialnumber{
    Cube(int num){
        super(num);
    }

    void cal(){
        System.out.println(n * n * n);
    }
}

