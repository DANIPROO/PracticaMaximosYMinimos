package tests;

import clases.Minimos;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMinimos {

    @Test
    public void testMinimoDe2EnterosPositivos() {
        assertEquals(3, Minimos.MinimoDe2EnterosPositivos(3, 5));
        assertEquals(7, Minimos.MinimoDe2EnterosPositivos(10, 7));
    }

    @Test
    public void testMinimoDe3EnterosPositivos() {
        assertEquals(3, Minimos.MinimoDe3EnterosPositivos(3, 5, 8));
        assertEquals(7, Minimos.MinimoDe3EnterosPositivos(10, 15, 7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinimoDe2EnterosPositivosConNegativos() {
        Minimos.MinimoDe2EnterosPositivos(-3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinimoDe3EnterosPositivosConNegativos() {
        Minimos.MinimoDe3EnterosPositivos(3, -5, 8);
    }
}

