package ComponentsTests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest
    private Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Slick", 33);
    }

    @Test
    public void canGetTreadType(){
        assertEquals("Slick", tyre.getTreadType);
    }

    @Test
    public void canGetPressure() {
        assertEquals(33, tyre.getPressure());
    }

}
