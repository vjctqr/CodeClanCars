package VehicleTests;

import Vehicles.FuelCar;
import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FuelCarTest {
    private FuelCar car;
    private Engine engine;


    @Before
    public void before(){
        engine = new Engine("petrol", 200);
        car = new FuelCar(engine, "red", 14000);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasColour(){
        assertEquals("red", car.getColour())
    }

    @Test
    public void hasPrice(){
        assertEquals(14000, car.getPrice());
    }
}
