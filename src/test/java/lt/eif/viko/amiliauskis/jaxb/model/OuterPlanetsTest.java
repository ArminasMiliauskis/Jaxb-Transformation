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
 * Test class for Outer planets object. Tests objects get/set methods and
 * toString method.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class OuterPlanetsTest {

    private final static String DEFAULT_XML_PATH = "SolarSystem.xml";
    Jaxb jaxb = new Jaxb();

    public OuterPlanetsTest() {
    }

    /**
     * Test of getPlanet method, of class OuterPlanets.
     */
    @Test
    public void testGetPlanet() {
        System.out.println("getPlanet");
        Planet planet = new Planet();
        planet.setName("Earth");
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        List<Planet> result = planetList;
        OuterPlanets instance = new OuterPlanets();
        instance.setPlanet(planetList);
        assertEquals(instance.getPlanet(), result);
    }

    /**
     * Test of setPlanet method, of class OuterPlanets.
     */
    @Test
    public void testSetPlanet() {
        System.out.println("setPlanet");
        Planet planet = new Planet();
        planet.setName("Earth");
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        List<Planet> result = planetList;
        OuterPlanets instance = new OuterPlanets();
        instance.setPlanet(planetList);
        assertEquals(instance.getPlanet(), result);
    }

    /**
     * Test of toString method, of class OuterPlanets.
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
        assertTrue(result.contains("Outer planets"));
        assertTrue(result.contains("Planet"));
    }

}
