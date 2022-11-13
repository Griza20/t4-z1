package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class LaptopDaoJsonFileTest
{
    @Test
    public void testiraDodavanje() {
        LaptopDaoJsonFile laptopi = new LaptopDaoJsonFile();
        Laptop l = new Laptop();
        l.setCijena(100);
        l.setProcesor("AMD");
        l.setSsd(500);
        laptopi.dodajLaptopUListu(l);
        assertEquals(l,laptopi.getLaptop("AMD"));
    }

}
