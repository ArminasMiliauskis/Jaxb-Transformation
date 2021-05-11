package lt.eif.viko.amiliauskis.jaxb.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import lt.eif.viko.amiliauskis.jaxb.transform.Jaxb;

/**
 * Test class for Stars object. tests stars get, set and toString methods.
 * 
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class StarsTest {
    
    private final static String DEFAULT_XML_PATH = "SolarSystem.xml";
    Jaxb jaxb = new Jaxb();
    public StarsTest() {
    }
    
    /**
     * Test of getStar method, of class Stars.
     */
    @Test
    public void testGetStar() {
        System.out.println("getStar");     
        Star star = new Star();
        star.setName("Sun");
        List<Star> starList = new ArrayList<>();
        starList.add(star);
        Stars instance = new Stars();
        instance.setStar(starList);
        List<Star> result = starList;
        assertEquals(result,instance.getStar());
        
    }

    /**
     * Test of setStar method, of class Stars.
     */
    @Test
    public void testSetStar() {
        System.out.println("setStar");
        Star star = new Star();
        star.setName("Sun");
        List<Star> starList = new ArrayList<>();
        starList.add(star);
        Stars instance = new Stars();
        instance.setStar(starList);
        List<Star> result = starList;
        assertEquals(result,instance.getStar());
        
    }

    /**
     * Test of toString method, of class Stars.
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
        assertTrue(result.contains("Stars"));
        assertTrue(result.contains("Star"));
        
    }
    
}
