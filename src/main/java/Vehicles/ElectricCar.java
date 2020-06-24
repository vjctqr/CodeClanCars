package Vehicles;

import Components.Battery;

public class ElectricCar implements IVehicle {
    private Battery battery;
    private int power;
    private String colour;
    private int price;

    public ElectricCar(Battery battery,int power, String colour, int price){
        this.battery = battery;
        this.power = power;
        this.colour = colour;
        this.price = price;
    }

    public Battery getBattery(){
        return this.battery;
    }

    public int getPower() {
        return power;
    }

    public String getColour() {
        return this.colour;
    }

    public int getPrice() {
        return 30000;
    }
}
