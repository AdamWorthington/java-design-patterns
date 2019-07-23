public class CarFactory {
   public Car getCar(String carType){
      switch (carType.toLowerCase()) {
        case "sedan":
            return new Sedan();
        case "crossover":
            return new Crossover();
        case "truck":
            return new Truck();
        default:
            return null;
     }
   }
}
