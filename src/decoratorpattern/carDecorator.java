package decoratorpattern;

public abstract class carDecorator implements Car{

    protected Car car;

    public carDecorator(Car car) {

        this.car = car;
    }

    @Override
    public Integer getPrice() {
        return this.car.getPrice();

    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}
