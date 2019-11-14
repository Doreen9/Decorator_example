package decoratorpattern;

public class Main {

    public static void main(String[] args) {
	Car sportsCar = new SportsCar(new BasicCar());
	sportsCar.assemble();
	System.out.println("Final price: " + sportsCar.getPrice());

    }
}
