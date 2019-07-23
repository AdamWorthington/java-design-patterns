public class Main{
    public static void main(String[] args){
        System.out.println("Creating car factory...");
        CarFactory carFactory = new CarFactory();
        
        System.out.println("Creating car 1 from car factory...");
        Car car1 = carFactory.getCar("Sedan");
        car1.specs();

        System.out.println("Creating car 2 from car factory...");
        Car car2 = carFactory.getCar("Crossover");
        car2.specs();

        System.out.println("Creating car 3 from car factory...");
        Car car3 = carFactory.getCar("Truck");
        car3.specs();
    }
}