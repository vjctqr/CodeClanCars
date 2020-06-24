package ComponentsTests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest{

    private Engine engine;

    @Before
    public void before(){
        engine = new Engine("petrol");
    }
    
    @Test
    public void test(){
        assertEquals("petrol", engine.get);
    }

}
