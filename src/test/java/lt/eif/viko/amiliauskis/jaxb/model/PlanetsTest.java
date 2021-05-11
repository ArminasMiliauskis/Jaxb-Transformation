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
import lt.eif.viko.amiliauskis.jaxb.transform.Jaxb;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Planets object. Tests objects get/set methods and toString
 * method.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class PlanetsTest {

    private final static String DEFAULT_XML_PATH = "SolarSystem.xml";
    Jaxb jaxb = new Jaxb();

    public PlanetsTest() {
    }

    /**
     * Test of getInnerPlanets method, of class Planets.
     */
    @Test
    public void testGetInnerPlanets() {
        System.out.println("getInnerPlanets");
        Planet planet = new Planet();
        planet.setName("Earth");
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        InnerPlanets innerPlanets = new InnerPlanets();
        innerPlanets.setPlanet(planetList);
        List<InnerPlanets> innerPlanetsList = new ArrayList<>();
        innerPlanetsList.add(innerPlanets);
        Planets instance = new Planets();
        instance.setInnerPlanets(innerPlanetsList);
        List<InnerPlanets> result = innerPlanetsList;
        assertEquals(result, instance.getInnerPlanets());
    }

    /**
     * Test of setInnerPlanets method, of class Planets.
     */
    @Test
    public void testSetInnerPlanets() {
        System.out.println("setInnerPlanets");
        Planet planet = new Planet();
        planet.setName("Earth");
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        InnerPlanets innerPlanets = new InnerPlanets();
        innerPlanets.setPlanet(planetList);
        List<InnerPlanets> innerPlanetsList = new ArrayList<>();
        innerPlanetsList.add(innerPlanets);
        Planets instance = new Planets();
        instance.setInnerPlanets(innerPlanetsList);
        List<InnerPlanets> result = innerPlanetsList;
        assertEquals(result, instance.getInnerPlanets());
    }

    /**
     * Test of getOuterPlanets method, of class Planets.
     */
    @Test
    public void testGetOuterPlanets() {
        System.out.println("getOuterPlanets");
        Planet planet = new Planet();
        planet.setName("Earth");
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        OuterPlanets outerPlanets = new OuterPlanets();
        outerPlanets.setPlanet(planetList);
        List<OuterPlanets> outerPlanetsList = new ArrayList<>();
        outerPlanetsList.add(outerPlanets);
        Planets instance = new Planets();
        instance.setOuterPlanets(outerPlanetsList);
        List<OuterPlanets> result = outerPlanetsList;
        assertEquals(result, instance.getOuterPlanets());
    }

    /**
     * Test of setOuterPlanets method, of class Planets.
     */
    @Test
    public void testSetOuterPlanets() {
        System.out.println("setOuterPlanets");
        Planet planet = new Planet();
        planet.setName("Earth");
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        OuterPlanets outerPlanets = new OuterPlanets();
        outerPlanets.setPlanet(planetList);
        List<OuterPlanets> outerPlanetsList = new ArrayList<>();
        outerPlanetsList.add(outerPlanets);
        Planets instance = new Planets();
        instance.setOuterPlanets(outerPlanetsList);
        List<OuterPlanets> result = outerPlanetsList;
        assertEquals(result, instance.getOuterPlanets());
    }

    /**
     * Test of toString method, of class Planets.
     *
     * @throws javax.xml.bind.JAXBException Exception occurred during JAXB
     * transformation
     * @throws java.io.IOException Exception occurred while reading/writing to
     * file
     */
    @Test
    public void testToString() throws JAXBException, IOException {
        System.out.println("toString");
        SolarSystem solarSystem;
        solarSystem = jaxb.transformToPOJO(DEFAULT_XML_PATH);
        String result = solarSystem.toString();
        assertTrue(result.contains("Inner planets"));
        assertTrue(result.contains("Outer planets"));
    }

}
