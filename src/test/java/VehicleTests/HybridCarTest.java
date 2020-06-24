package VehicleTests;

import Components.Engine;
import Components.Battery;
import Vehicles.HybridCar;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    private Engine engine;
    private Battery battery;
    private HybridCar car;

    @Before
    public void before(){
        engine = new Engine("petrol", 6);
        battery = new Battery("JMBS", 2000);
        car = new HybridCar(engine, battery);
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasBattery(){
        ass
    }
}
