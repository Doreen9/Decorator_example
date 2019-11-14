package normalway;

public class LuxuryCar extends BasicCar{

    public LuxuryCar(Boolean isLuxury, Boolean isSports) {
        super(isLuxury, isSports);
    }

    @Override
    public Boolean getIsLuxury(){
        return super.getIsSports();
    }

    @Override
    public Boolean getIsSports(){
        return false;
    }

    @Override
    public Integer getPrice() {
        return super.getPrice();
    }

}