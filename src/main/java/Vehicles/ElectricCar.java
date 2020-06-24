package Vehicles;

import Components.Battery;

public class ElectricCar IVehicle {
    private Battery battery;
    private int power;
    private String colour;
    private int price;

    public ElectricCar(Battery battery,int power, String colour, int price){
        this.battery = battery;
        this.colour = colour;
        this.power = power;
        this.price = price;
    }

    public Battery getbattery(){
        return this.battery;
    }

}
