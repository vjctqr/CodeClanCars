package People;

import Vehicles.IVehicle;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<IVehicle> collection;

    public Customer(int money){
        this.money = money;
        this.collection = new ArrayList<IVehicle>();
    }

    public int getMoney(){
        return this.money;
    }

    public int carCount(){
        return this.collection.size();
    }

    public void addCar(IVehicle vehicle){
        collection.add(vehicle);
    }

    public void removeCar(IVehicle vehicle){
       int index = collection.indexOf(vehicle);
       collection.remove(index);
    }
}
