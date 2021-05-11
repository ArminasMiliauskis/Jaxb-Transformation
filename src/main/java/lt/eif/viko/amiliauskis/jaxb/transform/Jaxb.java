/**
 * Transformation package contains JAXB transformation methods.
 */
package lt.eif.viko.amiliauskis.jaxb.transform;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import lt.eif.viko.amiliauskis.jaxb.model.SolarSystem;

/**
 * JAXB class for marshalling and unmarshalling. Has two methods used for
 * transforming XML document into plain old java object and for transforming
 * plain old java object into XML document.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class Jaxb {

    private final static String DEFAULT_XML_PATH = "SolarSystemFromPOJO.xml";

    /**
     * Transforms an XML document into plain old java object. Creates an
     * unmarshaller using JAXB context of the solar system class then reads the
     * specified XML document, after reading it makes a solar system object from
     * the specified XML document and outputs it.
     *
     * @param pathToXml path to the XML document
     * @return solarSystem object
     * @throws JAXBException Exception occurred during JAXB transformation
     * @throws IOException Exception occurred while reading/writing to file
     * @see lt.eif.viko.amiliauskis.jaxb.model.SolarSystem
     */
    public SolarSystem transformToPOJO(String pathToXml) throws JAXBException, IOException {

        JAXBContext jaxbContext = JAXBContext.newInstance(SolarSystem.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Path fileName = Path.of(pathToXml);
        String actual = Files.readString(fileName);
        StringReader reader = new StringReader(actual);
        SolarSystem solarSystem = (SolarSystem) unmarshaller.unmarshal(reader);

        return solarSystem;
    }

    /**
     * Transforms an XML file into plain old java object. Creates a marshaller
     * using JAXB context of the solar system class, transforms the specified
     * object into XML document, then creates a new XML document into the
     * default path and writes to it and outputs the XML document to console.
     *
     * @param object Object to transform to XML document
     * @throws JAXBException Exception occurred during JAXB transformation
     * @throws IOException Exception occurred while reading/writing to file
     */
    public void transformToXML(Object object) throws JAXBException, IOException {

        JAXBContext jaxbContext = JAXBContext.newInstance(SolarSystem.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(object, new File(DEFAULT_XML_PATH));
        Path fileName = Path.of(DEFAULT_XML_PATH);
        String actual = Files.readString(fileName);
        System.out.print(String.format("%n%s", actual));

    }
}
