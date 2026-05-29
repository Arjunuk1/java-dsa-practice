public class Exception_hadling1 {
    public static void main(String[] args) {
        System.out.println(divide(1, 1));
    }

    public static int divide(int a, int b){
        try{
            return a / b;
        }catch(Exception s){
            return -1;
        }finally{
            System.out.println("Bye");
            System.out.println("Nigga");
        }
    }
}
