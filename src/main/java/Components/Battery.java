package Components;

public class Battery {

    private String manufacturer;
    private int power;

    public Battery(String manufacturer, int power){
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public int getPower(){
        return this.power;
    }

}
