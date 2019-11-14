package decoratorpattern;

public class LuxuryCar extends carDecorator{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Luxury car!");
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 180000;
    }



}
