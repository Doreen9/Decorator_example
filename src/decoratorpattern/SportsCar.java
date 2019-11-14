package decoratorpattern;

public class SportsCar extends carDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Sports car");
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 70000;
    }

}
