package normalway;

public class SportsCar extends BasicCar {

    public SportsCar(Boolean isLuxury, Boolean isSports) {
        super(isLuxury, isSports);
    }

    @Override
    public Boolean getIsLuxury(){
        return false;
    }

    @Override
    public Boolean getIsSports(){
        return super.getIsSports();
    }

    @Override
    public Integer getPrice() {
        return super.getPrice();
    }
}
