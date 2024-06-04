package tests;

import clases.Maximos;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMaximos {

    @Test
    public void testMaximoDe2EnterosPositivos() {
        assertEquals(5, Maximos.MaximoDe2EnterosPositivos(3, 5));
        assertEquals(10, Maximos.MaximoDe2EnterosPositivos(10, 7));
    }

    @Test
    public void testMaximoDe3EnterosPositivos() {
        assertEquals(8, Maximos.MaximoDe3EnterosPositivos(3, 5, 8));
        assertEquals(15, Maximos.MaximoDe3EnterosPositivos(10, 15, 7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaximoDe2EnterosPositivosConNegativos() {
        Maximos.MaximoDe2EnterosPositivos(-3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaximoDe3EnterosPositivosConNegativos() {
        Maximos.MaximoDe3EnterosPositivos(3, -5, 8);
    }
}


 









