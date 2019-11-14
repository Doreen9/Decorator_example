package normalway;

public class Main {

    public static void main(String[] args) {
       Car sportsCar = new SportsCar(false, true);
       Car luxuryCar = new LuxuryCar(true, false);

       System.out.println("Price for sports car: " + sportsCar.getPrice());
       System.out.println("Price for luxury car: " + luxuryCar.getPrice());

    }
}
