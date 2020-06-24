package ComponentsTests;

import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest{

    private Engine engine;

    @Before
    public void before(){
        engine = new Engine("petrol", 150);
    }
    
    @Test
    public void canGetFuelType(){
        assertEquals("petrol", engine.getFuelType());
    }

    @Test
    public void canGetHorsePower(){
        assertEquals(150, engine.getHorsePower());
    }

}
