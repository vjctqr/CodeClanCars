package People;

import Vehicles.IVehicle;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<IVehicle> stock;

    public Dealership(int till){
        this.till = till;
        this.stock = new ArrayList<IVehicle>();
    }

    public int getTill(){
        return this.till;
    }

    public int carCount(){
        return this.stock.size();
    }

    public void addCar(IVehicle vehicle){
        collection.add(vehicle);
    }

}
