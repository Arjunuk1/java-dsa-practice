import java.util.*;

public class classPolygon {
    protected int sides;

    classPolygon(int s){
        sides = s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        PolygonSquare sq = new PolygonSquare();
        PolygonTriangle tr = new PolygonTriangle();
        classPolygon p = new classPolygon(s);

        sq.draw();
        tr.draw();
        p.draw();
        sc.close();
    }

    public void draw(){
        if(sides == 4){
            System.out.println("Square has 4 sides");
        }else if(sides == 3){
            System.out.println("Triangle has 3 sides");
        }else{
            System.out.println("Polygon of " + sides + " sides");
        }
    }
}

class PolygonSquare extends classPolygon{
    PolygonSquare(){
        super(4);
    }
}

class PolygonTriangle extends classPolygon{
    PolygonTriangle(){
        super(3);
    }
}