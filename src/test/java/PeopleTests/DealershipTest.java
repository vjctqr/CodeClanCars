package PeopleTests;

import People.Customer;
import Vehicles.FuelCar;
import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private FuelCar fuelCar;
    private Engine engine;

    @Before
    public void before(){
        dealership = new Dealership(16000);
        engine = new Engine("petrol", 230);
        fuelCar = new fuelCar(engine, "black", 30000);
    }

    @Test
    public void hasTill(){
        assertEquals(dealership.getTill());
    }

    @Test
    public void hasNoCarsAtStart(){
        assertEquals(0, dealership.carCount());
    }

    @Test
    public void canAddCarToCollection(){
        dealership.addCar(fuelCar);
        assertEquals(1, dealership.carCount());
    }

}
