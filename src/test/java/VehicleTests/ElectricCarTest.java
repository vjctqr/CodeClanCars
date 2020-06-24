package VehicleTests;

import Components.Battery;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static java.awt.Color.yellow;
import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

        private ElectricCar car;
        private Battery battery;


    @Before
    public void before(){
        battery = new Battery("APC", 5000);
        car = new ElectricCar(battery, 5000, "yellow", 30000);
    }

    @Test
    public void hasBattery(){
        assertEquals(battery, car.getBattery());
    }

    @Test
    public void hasPower(){
        assertEquals(5000, car.getPower());
    }

    @Test
    public void hasColour(){
        assertEquals("yellow", car.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(30000, car.getPrice());
    }



}
