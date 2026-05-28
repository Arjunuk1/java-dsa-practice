import java.util.*;

public class classbox {
    private int length;
    private int breadth;
    private int height;

    classbox(){
        int length = 0;
        int breadth = 0;
        int height = 0;
    }

    classbox(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    classbox(classbox b1){
        this.length = b1.length;
        this.breadth = b1.breadth;
        this.height = b1.height;
    }

    int getlength(){
        return length;
    }

    int getbreadth(){
        return breadth;
    }

    int getheight(){
        return height;
    }

    long getvolume(){
        return (long) length * breadth * height; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        classbox b1 = new classbox();
        System.out.println(b1.getlength() + " " + b1.getbreadth() + " " + b1.getheight() + " " + b1.getvolume());

        classbox b2 = new classbox(l, b, h);
        System.out.println(b2.getlength() + " " + b2.getbreadth() + " " + b2.getheight() + " " + b2.getvolume());

        classbox b3 = new classbox(b2);
        System.out.println(b3.getlength() + " " + b3.getbreadth() + " " + b3.getheight() + " " + b3.getvolume());
    }
}