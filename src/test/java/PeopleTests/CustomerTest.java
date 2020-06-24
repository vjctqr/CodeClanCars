package PeopleTests;

import People.Customer;
import org.junit.Before;
import org.junit.Test;

import Vehicles.HybridCar;
import Vehicles.FuelCar;
import Components.Engine;
import Components.Battery;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Engine engine;
    private Battery battery;
    private HybridCar hybridCar;
    private FuelCar fuelCar;
    private Customer customer;


    @Before
    public void before(){
        engine = new Engine("petrol", 250);
        battery = new Battery("JMBS", 2300);
        fuelCar = new FuelCar(engine, "green", 10000);
        hybridCar = new HybridCar(engine, battery, "blue", 30000);
        customer = new Customer(16000);
    }

    @Test
    public void hasMoney(){
        assertEquals(16000, customer.getMoney());
    }

    @Test
    public void hasNoCars(){
        assertEquals(0, customer.carCount());
    }
}
