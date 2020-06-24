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
    private Customer customer;


    @Before
    public void before(){
        engine = new Engine("petrol", 250);
        battery = new Battery("JMBS", 2300);
        hybridCar = new HybridCar(engine, battery, "blue", 30000);
        customer = new Customer(16000);
    }

    @Test
    public void hasMoney(){
        assertEquals(16000, customer.getMoney());
    }

    @Test
    public void hasNoCarsAtStart(){
        assertEquals(0, customer.carCount());
    }

    @Test
    public void canAddCarToCollection(){
        customer.addCar(hybridCar);
        assertEquals(1, customer.carCount());
    }

    @Test
    public void canRemoveCarFromCollection(){
        customer.addCar(hybridCar);
        customer.removeCar(hybridCar);
        assertEquals(0, customer.carCount());
    }

}
