package VehicleTests;

import Vehicles.FuelCar;
import Components.Tyres;
import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FuelCarTest {
    private FuelCar car;
    private Engine engine;
    private ArrayList<Tyres> tyres;
    private Tyres tyre;


    @Before
    public void before(){
        engine = new Engine("petrol", 200);
        tyre = new Tyres("Slick", 33);
        tryes = new ArrayList<Tyres>();
        tryes.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        car = new FuelCar(engine, tyres);
    }

    @Test
    public void canGetEngi(){
        assertEquals();
    }
}
