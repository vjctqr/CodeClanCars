package People;

import Vehicles.IVehicles;

public class Customer {

    private int money;
    private ArrayList<IVehicle> collection;

    public Customer(int money){
        this.money = money;
        collection = new ArrayList<IVehicle>();
    }

    public int getMoney(){
        return this.money;
    }
}
