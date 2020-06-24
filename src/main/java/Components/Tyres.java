package Components;

public class Tyres {
    private String treadType;
    private int pressure;

    public Tyres(String treadType, int pressure){
        this.treadType = treadType;
        this.pressure = pressure;
    }

    public String getTreadType(){
        return this.treadType;
    }

    public int getPressure(){
        return this.pressure;
    }
}
