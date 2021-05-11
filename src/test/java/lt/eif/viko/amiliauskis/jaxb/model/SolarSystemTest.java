/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.amiliauskis.jaxb.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import lt.eif.viko.amiliauskis.jaxb.transform.Jaxb;

/**
 * Test class for Solar system root object. Tests objects get/set methods and
 * toString method.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class SolarSystemTest {

    private final static String DEFAULT_XML_PATH = "SolarSystem.xml";
    Jaxb jaxb = new Jaxb();

    public SolarSystemTest() {
    }

    /**
     * Test of getAge method, of class SolarSystem.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        SolarSystem instance = new SolarSystem();
        instance.setAge(4.568);
        Double expResult = 4.568;
        Double result = instance.getAge();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAge method, of class SolarSystem.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        Double age = 4.568;
        SolarSystem instance = new SolarSystem();
        instance.setAge(age);
        assertEquals(instance.getAge(), age);

    }

    /**
     * Test of getAgeUnit method, of class SolarSystem.
     */
    @Test
    public void testGetAgeUnit() {
        System.out.println("getAgeUnit");
        SolarSystem instance = new SolarSystem();
        String expResult = "Billion years";
        instance.setAgeUnit("Billion years");
        String result = instance.getAgeUnit();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAgeUnit method, of class SolarSystem.
     */
    @Test
    public void testSetAgeUnit() {
        System.out.println("setAgeUnit");
        String ageUnit = "Billion years";
        SolarSystem instance = new SolarSystem();
        instance.setAgeUnit(ageUnit);
        assertEquals(instance.getAgeUnit(), ageUnit);

    }

    /**
     * Test of getLocation method, of class SolarSystem.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        SolarSystem instance = new SolarSystem();
        String expResult = "Milky Way";
        instance.setLocation("Milky Way");
        String result = instance.getLocation();
        assertEquals(expResult, result);

    }

    /**
     * Test of setLocation method, of class SolarSystem.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "Milky Way";
        SolarSystem instance = new SolarSystem();
        instance.setLocation(location);
        assertEquals(instance.getLocation(), location);
    }

    /**
     * Test of getStars method, of class SolarSystem.
     */
    @Test
    public void testGetStars() {
        System.out.println("getStars");
        Star star = new Star();
        star.setName("Sun");
        List<Star> starList = new ArrayList<>();
        starList.add(star);
        Stars stars = new Stars();
        stars.setStar(starList);
        List<Stars> starsList = new ArrayList<>();
        starsList.add(stars);
        List<Stars> result = starsList;
        SolarSystem instance = new SolarSystem();
        instance.setStars(starsList);
        assertEquals(starsList, result);

    }

    /**
     * Test of setStars method, of class SolarSystem.
     */
    @Test
    public void testSetStars() {
        System.out.println("setStars");
        Star star = new Star();
        star.setName("Sun");
        List<Star> starList = new ArrayList<>();
        starList.add(star);
        Stars stars = new Stars();
        stars.setStar(starList);
        List<Stars> starsList = new ArrayList<>();
        starsList.add(stars);
        List<Stars> result = starsList;
        SolarSystem instance = new SolarSystem();
        instance.setStars(starsList);
        assertEquals(starsList, result);

    }

    /**
     * Test of getPlanets method, of class SolarSystem.
     */
    @Test
    public void testGetPlanets() {
        System.out.println("getPlanets");
        Planet planet = new Planet();
        planet.setName("Earth");
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        InnerPlanets innerPlanets = new InnerPlanets();
        OuterPlanets outerPlanets = new OuterPlanets();
        innerPlanets.setPlanet(planetList);
        outerPlanets.setPlanet(planetList);
        List<InnerPlanets> innerPlanetsList = new ArrayList<>();
        List<OuterPlanets> outerPlanetsList = new ArrayList<>();
        innerPlanetsList.add(innerPlanets);
        outerPlanetsList.add(outerPlanets);
        Planets planets = new Planets();
        planets.setInnerPlanets(innerPlanetsList);
        planets.setOuterPlanets(outerPlanetsList);
        List<Planets> planetsList = new ArrayList<>();
        planetsList.add(planets);
        List<Planets> result = planetsList;
        SolarSystem instance = new SolarSystem();
        instance.setPlanets(planetsList);
        assertEquals(planetsList, result);

    }

    /**
     * Test of setPlanets method, of class SolarSystem.
     */
    @Test
    public void testSetPlanets() {
        System.out.println("setPlanets");
        Planet planet = new Planet();
        planet.setName("Earth");
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        InnerPlanets innerPlanets = new InnerPlanets();
        OuterPlanets outerPlanets = new OuterPlanets();
        innerPlanets.setPlanet(planetList);
        outerPlanets.setPlanet(planetList);
        List<InnerPlanets> innerPlanetsList = new ArrayList<>();
        List<OuterPlanets> outerPlanetsList = new ArrayList<>();
        innerPlanetsList.add(innerPlanets);
        outerPlanetsList.add(outerPlanets);
        Planets planets = new Planets();
        planets.setInnerPlanets(innerPlanetsList);
        planets.setOuterPlanets(outerPlanetsList);
        List<Planets> planetsList = new ArrayList<>();
        planetsList.add(planets);
        List<Planets> result = planetsList;
        SolarSystem instance = new SolarSystem();
        instance.setPlanets(planetsList);
        assertEquals(planetsList, result);

    }

    /**
     * Test of toString method, of class SolarSystem.
     *
     * @throws javax.xml.bind.JAXBException Exception occurred during JAXB
     * transformation
     * @throws java.io.IOException Exception occurred while reading/writing to
     * file
     */
    @Test
    public void testToString() throws JAXBException, IOException {
        System.out.println("toString");
        SolarSystem instance;
        instance = jaxb.transformToPOJO(DEFAULT_XML_PATH);
        String result = instance.toString();
        assertTrue(result.contains("4.568"));
        assertTrue(result.contains("Billion years"));
        assertTrue(result.contains("Milky Way"));
        assertTrue(result.contains("Stars"));
        assertTrue(result.contains("Planets"));
        assertTrue(result.contains("Planet"));
        assertTrue(result.contains("Star"));
    }
}
