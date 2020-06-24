package Vehicles;

import Components.Engine;

public class FuelCar {
    private Engine engine;

    public FuelCar(Engine engine){
        this.engine = engine;
    }

    public Engine getEngine(){
        return this.engine;
    }

}
