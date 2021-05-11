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
 * Test class for Inner planets object. Tests objects get/set methods and
 * toString method.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class InnerPlanetsTest {

    private final static String DEFAULT_XML_PATH = "SolarSystem.xml";
    Jaxb jaxb = new Jaxb();

    public InnerPlanetsTest() {
    }

    /**
     * Test of getPlanet method, of class InnerPlanets.
     */
    @Test
    public void testGetPlanet() {
        System.out.println("getPlanet");
        Planet planet = new Planet();
        planet.setName("Earth");
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        InnerPlanets innerPlanets = new InnerPlanets();
        innerPlanets.setPlanet(planetList);
        List<Planet> result = planetList;
        InnerPlanets instance = new InnerPlanets();
        instance.setPlanet(planetList);
        assertEquals(instance.getPlanet(), result);
    }

    /**
     * Test of setPlanet method, of class InnerPlanets.
     */
    @Test
    public void testSetPlanet() {
        System.out.println("setPlanet");
        Planet planet = new Planet();
        planet.setName("Earth");
        List<Planet> planetList = new ArrayList<>();
        planetList.add(planet);
        InnerPlanets innerPlanets = new InnerPlanets();
        innerPlanets.setPlanet(planetList);
        List<Planet> result = planetList;
        InnerPlanets instance = new InnerPlanets();
        instance.setPlanet(planetList);
        assertEquals(instance.getPlanet(), result);
    }

    /**
     * Test of toString method, of class InnerPlanets.
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
        assertTrue(result.contains("Planet"));
    }

}
