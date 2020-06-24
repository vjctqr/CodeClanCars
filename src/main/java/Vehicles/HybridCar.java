package Vehicles;

import Components.Battery;
import Components.Engine;

public class HybridCar implements IVehicle{
    private Engine engine;
    private Battery battery;
    private int price;
    private String colour;

    public HybridCar(Engine engine, Battery battery, String colour, int price){
        this.engine = engine;
        this.battery = battery;
        this.colour = colour;
        this.price = price;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public Battery getBattery(){
        return this.battery;
    }

    public int getPrice(){
        return this.price;
    }

    public String getColour(){
        return this.colour;
    }
}
