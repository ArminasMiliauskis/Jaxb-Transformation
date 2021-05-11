/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.amiliauskis.jaxb.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Planet object. Tests objects get/set methods and toString
 * method.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class PlanetTest {

    public PlanetTest() {
    }

    /**
     * Test of getName method, of class Planet.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Planet instance = new Planet();
        String expResult = "Earth";
        instance.setName("Earth");
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Planet.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Earth";
        Planet instance = new Planet();
        instance.setName(name);
        assertEquals(instance.getName(), name);

    }

    /**
     * Test of getMass method, of class Planet.
     */
    @Test
    public void testGetMass() {
        System.out.println("getMass");
        Planet instance = new Planet();
        Double expResult = 1.000;
        instance.setMass(1.000);
        Double result = instance.getMass();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMass method, of class Planet.
     */
    @Test
    public void testSetMass() {
        System.out.println("setMass");
        Double mass = 1.000;
        Planet instance = new Planet();
        instance.setMass(mass);
        assertEquals(instance.getMass(), mass);

    }

    /**
     * Test of getMassUnit method, of class Planet.
     */
    @Test
    public void testGetMassUnit() {
        System.out.println("getMassUnit");
        Planet instance = new Planet();
        String expResult = "Earths";
        instance.setMassUnit("Earths");
        String result = instance.getMassUnit();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMassUnit method, of class Planet.
     */
    @Test
    public void testSetMassUnit() {
        System.out.println("setMassUnit");
        String massUnit = "Earths";
        Planet instance = new Planet();
        instance.setMassUnit(massUnit);
        assertEquals(instance.getMassUnit(), massUnit);
    }

    /**
     * Test of getVolume method, of class Planet.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Planet instance = new Planet();
        Double expResult = 0.866;
        instance.setVolume(0.866);
        Double result = instance.getVolume();
        assertEquals(expResult, result);

    }

    /**
     * Test of setVolume method, of class Planet.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        Double volume = 0.866;
        Planet instance = new Planet();
        instance.setVolume(volume);
        assertEquals(instance.getVolume(), volume);

    }

    /**
     * Test of getVelocity method, of class Planet.
     */
    @Test
    public void testGetVelocity() {
        System.out.println("getVelocity");
        Planet instance = new Planet();
        Integer expResult = 35;
        instance.setVelocity(35);
        Integer result = instance.getVelocity();
        assertEquals(expResult, result);

    }

    /**
     * Test of setVelocity method, of class Planet.
     */
    @Test
    public void testSetVelocity() {
        System.out.println("setVelocity");
        Integer velocity = 35;
        Planet instance = new Planet();
        instance.setVelocity(velocity);
        assertEquals(instance.getVelocity(), velocity);

    }

    /**
     * Test of getVelocityUnit method, of class Planet.
     */
    @Test
    public void testGetVelocityUnit() {
        System.out.println("getVelocityUnit");
        Planet instance = new Planet();
        String expResult = "km/s";
        instance.setVelocityUnit("km/s");
        String result = instance.getVelocityUnit();
        assertEquals(expResult, result);

    }

    /**
     * Test of setVelocityUnit method, of class Planet.
     */
    @Test
    public void testSetVelocityUnit() {
        System.out.println("setVelocityUnit");
        String velocityUnit = "km/s";
        Planet instance = new Planet();
        instance.setVelocityUnit(velocityUnit);
        assertEquals(instance.getVelocityUnit(), velocityUnit);
    }

    /**
     * Test of getType method, of class Planet.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Planet instance = new Planet();
        String expResult = "Terrestrial";
        instance.setType("Terrestrial");
        String result = instance.getType();
        assertEquals(expResult, result);

    }

    /**
     * Test of setType method, of class Planet.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "Terrestrial";
        Planet instance = new Planet();
        instance.setType(type);
        assertEquals(instance.getType(), type);
    }

    /**
     * Test of getNaturalSatellites method, of class Planet.
     */
    @Test
    public void testGetNaturalSatellites() {
        System.out.println("getNaturalSatellites");
        NaturalSatellite naturalSatellite = new NaturalSatellite();
        naturalSatellite.setName("Moon");
        List<NaturalSatellite> naturalSatelliteList = new ArrayList<>();
        naturalSatelliteList.add(naturalSatellite);
        NaturalSatellites naturalSatellites = new NaturalSatellites();
        naturalSatellites.setNaturalSatellite(naturalSatelliteList);
        List<NaturalSatellites> naturalSatellitesList = new ArrayList<>();
        naturalSatellitesList.add(naturalSatellites);
        List<NaturalSatellites> result = naturalSatellitesList;
        Planet instance = new Planet();
        instance.setNaturalSatellites(naturalSatellitesList);
        assertEquals(instance.getNaturalSatellites(), result);
    }

    /**
     * Test of setNaturalSatellites method, of class Planet.
     */
    @Test
    public void testSetNaturalSatellites() {
        System.out.println("setNaturalSatellites");
        NaturalSatellite naturalSatellite = new NaturalSatellite();
        naturalSatellite.setName("Moon");
        List<NaturalSatellite> naturalSatelliteList = new ArrayList<>();
        naturalSatelliteList.add(naturalSatellite);
        NaturalSatellites naturalSatellites = new NaturalSatellites();
        naturalSatellites.setNaturalSatellite(naturalSatelliteList);
        List<NaturalSatellites> naturalSatellitesList = new ArrayList<>();
        naturalSatellitesList.add(naturalSatellites);
        List<NaturalSatellites> result = naturalSatellitesList;
        Planet instance = new Planet();
        instance.setNaturalSatellites(naturalSatellitesList);
        assertEquals(instance.getNaturalSatellites(), result);

    }

    /**
     * Test of toString method, of class Planet.
     */
    @Test
    public void testToString() {
        System.out.println("toString");

        Planet instance = new Planet();
        instance.setName("Earth");
        instance.setMass(1.000);
        instance.setMassUnit("Earths");
        instance.setVolume(0.866);
        instance.setVelocity(30);
        instance.setVelocityUnit("km/s");
        instance.setType("Terrestrial");
        instance.setNaturalSatellites(null);

        String result = instance.toString();
        assertTrue(result.contains("Earth"));
        assertTrue(result.contains("1.000"));
        assertTrue(result.contains("0.866"));
        assertTrue(result.contains("30"));
        assertTrue(result.contains("km/s"));
        assertTrue(result.contains("Terrestrial"));

    }

}
