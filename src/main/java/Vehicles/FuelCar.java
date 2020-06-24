package Vehicles;

import Components.Engine;

public class FuelCar implements IVehicle{
    private Engine engine;
    private String colour;
    private int price;

    public FuelCar(Engine engine, String colour, int price){
        this.engine = engine;
        this.colour = colour;
        this.price = price;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public String getColour(){
        return this.colour;
    }

    public int getPrice(){
        return this.price;
    }

}
