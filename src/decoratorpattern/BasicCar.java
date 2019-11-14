package decoratorpattern;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }

    @Override
    public Integer getPrice() {
        return 3400;
    }


}
