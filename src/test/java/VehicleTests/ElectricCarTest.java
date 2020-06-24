package VehicleTests;

import Components.Battery;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

public class ElectricCarTest {

        private ElectricCar car;
        private Battery battery;


    @Before
    public void before(){
        battery = new Battery("APC", 5000);
        car = new ElectricCar(battery, yellow, 30000);
    }

    @Test

}
