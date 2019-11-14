package normalway;

public abstract class BasicCar implements Car {

    public Boolean isLuxury;
    public Boolean isSports;

    public BasicCar(Boolean isLuxury, Boolean isSports) {
        this.isLuxury = isLuxury;
        this.isSports = isSports;
    }

    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }


    public Boolean getIsLuxury(){
        return true;
    }

    public Boolean getIsSports(){
        return true;
    }

    public Integer cost = 0;

    @Override
    public Integer getPrice(){
        if(getIsLuxury()){
            this.cost = 3400 + 180000;
        }
        else if(getIsSports()){
            this.cost = 3400 + 70000;
        }
        return this.cost;
    }
}
