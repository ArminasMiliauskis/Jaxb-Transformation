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
 * Test class for Natural satellites object. Tests objects get/set methods and
 * toString method.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class NaturalSatellitesTest {

    private final static String DEFAULT_XML_PATH = "SolarSystem.xml";
    Jaxb jaxb = new Jaxb();

    public NaturalSatellitesTest() {
    }

    /**
     * Test of getNaturalSatellite method, of class NaturalSatellites.
     */
    @Test
    public void testGetNaturalSatellite() {
        System.out.println("getNaturalSatellite");
        NaturalSatellite naturalSatellite = new NaturalSatellite();
        naturalSatellite.setName("Moon");
        List<NaturalSatellite> naturalSatelliteList = new ArrayList<>();
        naturalSatelliteList.add(naturalSatellite);
        List<NaturalSatellite> result = naturalSatelliteList;
        NaturalSatellites instance = new NaturalSatellites();
        instance.setNaturalSatellite(naturalSatelliteList);
        assertEquals(result, instance.getNaturalSatellite());
    }

    /**
     * Test of setNaturalSatellite method, of class NaturalSatellites.
     */
    @Test
    public void testSetNaturalSatellite() {
        System.out.println("setNaturalSatellite");
        NaturalSatellite naturalSatellite = new NaturalSatellite();
        naturalSatellite.setName("Moon");
        List<NaturalSatellite> naturalSatelliteList = new ArrayList<>();
        naturalSatelliteList.add(naturalSatellite);
        List<NaturalSatellite> result = naturalSatelliteList;
        NaturalSatellites instance = new NaturalSatellites();
        instance.setNaturalSatellite(naturalSatelliteList);
        assertEquals(result, instance.getNaturalSatellite());
    }

    /**
     * Test of toString method, of class NaturalSatellites.
     *
     * @throws javax.xml.bind.JAXBException Exception occurred during JAXB
     * transformation
     * @throws java.io.IOException Exception occurred while reading/writing to
     * file
     */
    @Test
    public void testToString() throws JAXBException, IOException {
        System.out.println("toString");
        SolarSystem solarSystem = new SolarSystem();
        solarSystem = jaxb.transformToPOJO(DEFAULT_XML_PATH);

        String result = solarSystem.toString();
        assertTrue(result.contains("Natural satellite"));
        assertTrue(result.contains("Earth"));
    }

}
