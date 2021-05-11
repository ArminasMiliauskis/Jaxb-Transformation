/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.amiliauskis.jaxb.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Natural satellite object. Tests objects get/set methods and
 * toString method.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class NaturalSatelliteTest {

    public NaturalSatelliteTest() {
    }

    /**
     * Test of getName method, of class NaturalSatellite.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        NaturalSatellite instance = new NaturalSatellite();
        String expResult = "Moon";
        instance.setName("Moon");
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class NaturalSatellite.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Moon";
        NaturalSatellite instance = new NaturalSatellite();
        instance.setName(name);
        assertEquals(instance.getName(), name);

    }

    /**
     * Test of toString method, of class NaturalSatellite.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NaturalSatellite instance = new NaturalSatellite();
        instance.setName("Moon");
        String result = instance.toString();
        assertTrue(result.contains("Moon"));
    }

}
