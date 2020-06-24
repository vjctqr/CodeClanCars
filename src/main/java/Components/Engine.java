package Components;

public class Engine {
    private String fuelType;
    private int horsePower;

    public Engine(String fuelType, int horsePower){
        this.fuelType = fuelType;
        this.horsePower = horsePower;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public int getHorsePower(){
        return this.horsePower;
    }
}
