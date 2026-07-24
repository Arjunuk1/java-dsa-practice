public class classCar {
    String color;
    String brand;

        void start() {
                System.out.println("Car Started");
        }

        public static void main(String[] args) {
                classCar c1 = new classCar();
                c1.color = "Black";
                c1.brand = "BMW";

                System.out.println(c1.color);
                System.out.println(c1.brand);
                c1.start();
        }
}
