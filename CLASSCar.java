public class CLASSCar {
    
    void start(){
        System.out.println("Car Started");
    }
    void stop(){
        System.out.println("Car Stopped");
    }

    public static void main(String[] args) {
        CLASSCar car = new CLASSCar();
        car.start();
        car.stop();
    }
}
