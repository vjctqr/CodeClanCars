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
}
