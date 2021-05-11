/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.amiliauskis.jaxb.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Star object. Tests object's get/set methods and toString
 * method.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class StarTest {

    public StarTest() {
    }

    /**
     * Test of getName method, of class Star.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Star instance = new Star();
        String expResult = "Sun";
        instance.setName("Sun");
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Star.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Sun";
        Star instance = new Star();
        instance.setName(name);
        assertEquals(instance.getName(), name);

    }

    /**
     * Test of getMass method, of class Star.
     */
    @Test
    public void testGetMass() {
        System.out.println("getMass");
        Star instance = new Star();
        Integer expResult = 333000;
        instance.setMass(333000);
        Integer result = instance.getMass();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMass method, of class Star.
     */
    @Test
    public void testSetMass() {
        System.out.println("setMass");
        Integer mass = 333000;
        Star instance = new Star();
        instance.setMass(mass);
        assertEquals(instance.getMass(), mass);

    }

    /**
     * Test of getMassUnit method, of class Star.
     */
    @Test
    public void testGetMassUnit() {
        System.out.println("getMassUnit");
        Star instance = new Star();
        String expResult = "Earths";
        instance.setMassUnit("Earths");
        String result = instance.getMassUnit();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMassUnit method, of class Star.
     */
    @Test
    public void testSetMassUnit() {
        System.out.println("setMassUnit");
        String massUnit = "Earths";
        Star instance = new Star();
        instance.setMassUnit(massUnit);
        assertEquals(instance.getMassUnit(), massUnit);
    }

    /**
     * Test of getVolume method, of class Star.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Integer volume = 1300000;
        Star instance = new Star();
        instance.setVolume(volume);
        assertEquals(instance.getVolume(), volume);
    }

    /**
     * Test of setVolume method, of class Star.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        Integer volume = 1300000;
        Star instance = new Star();
        instance.setVolume(volume);
        assertEquals(instance.getVolume(), volume);
    }

    /**
     * Test of getAge method, of class Star.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Star instance = new Star();
        Long expResult = 4600000000L;
        instance.setAge(4600000000L);
        Long result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Star.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        Long age = 4600000000L;
        Star instance = new Star();
        instance.setAge(age);
        assertEquals(instance.getAge(), age);

    }

    /**
     * Test of getVelocity method, of class Star.
     */
    @Test
    public void testGetVelocity() {
        System.out.println("getVelocity");
        Star instance = new Star();
        Integer expResult = 210;
        instance.setVelocity(210);
        Integer result = instance.getVelocity();
        assertEquals(expResult, result);

    }

    /**
     * Test of setVelocity method, of class Star.
     */
    @Test
    public void testSetVelocity() {
        System.out.println("setVelocity");
        Integer velocity = 210;
        Star instance = new Star();
        instance.setVelocity(velocity);
        assertEquals(instance.getVelocity(), velocity);

    }

    /**
     * Test of getVelocityUnit method, of class Star.
     */
    @Test
    public void testGetVelocityUnit() {
        System.out.println("getVelocityUnit");
        Star instance = new Star();
        String expResult = "km/s";
        instance.setVelocityUnit("km/s");
        String result = instance.getVelocityUnit();
        assertEquals(expResult, result);

    }

    /**
     * Test of setVelocityUnit method, of class Star.
     */
    @Test
    public void testSetVelocityUnit() {
        System.out.println("setVelocityUnit");
        String velocityUnit = "km/s";
        Star instance = new Star();
        instance.setVelocityUnit(velocityUnit);
        assertEquals(instance.getVelocityUnit(), velocityUnit);
    }

    /**
     * Test of toString method, of class Star.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Star instance = new Star();
        instance.setAge(4600000000L);
        instance.setMass(333000);
        instance.setMassUnit("Earths");
        instance.setName("Sun");
        instance.setVelocity(210);
        instance.setVelocityUnit("km/s");
        instance.setVolume(1300000);

        String result = instance.toString();
        assertTrue(result.contains("4600000000"));
        assertTrue(result.contains("333000"));
        assertTrue(result.contains("Earths"));
        assertTrue(result.contains("Sun"));
        assertTrue(result.contains("210"));
        assertTrue(result.contains("km/s"));
        assertTrue(result.contains("1300000"));
    }

}
