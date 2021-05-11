package lt.eif.viko.amiliauskis.jaxb;

import java.io.IOException;
import javax.xml.bind.JAXBException;
import lt.eif.viko.amiliauskis.jaxb.model.SolarSystem;
import lt.eif.viko.amiliauskis.jaxb.net.JavaClient;
import lt.eif.viko.amiliauskis.jaxb.transform.Jaxb;
import lt.eif.viko.amiliauskis.jaxb.transform.Validation;

/**
 * Main class of the program, responsible for operating JAXB transformations and
 * server - client connection establishment. Has a main function which connects
 * to the server class, retrieves an XML document, transforms it solarSystem
 * object and outputs its values, then transforms the solarSystem object to XML
 * file and outputs it on the console.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class MainJaxb {

    private final static String DEFAULT_IP = "127.0.0.1";
    private final static int DEFAULT_PORT = 6666;
    private final static String DEFAULT_XML_PATH = "SolarSystem.xml";
    private final static String DEFAULT_XSD_PATH = "solarSystem.xsd";

    /**
     * main function which connects to the server class, retrieves an XML
     * document, validates it against XSD schema transforms it to a solarSystem
     * object and outputs its values, then transforms the solarSystem object to
     * XML file and outputs it on the console.
     *
     * @param args accepts a single argument of string type
     * @throws JAXBException Exception occurred during JAXB transformation
     * @throws IOException Exception occurred while reading/writing to file
     * @see lt.eif.viko.amiliauskis.jaxb.transform.Jaxb
     * @see lt.eif.viko.amiliauskis.jaxb.transform.Validation
     * @see lt.eif.viko.amiliauskis.jaxb.net.JavaClient
     * @see lt.eif.viko.amiliauskis.jaxb.model.SolarSystem
     */
    public static void main(String[] args) throws JAXBException, IOException {

        JavaClient client = new JavaClient();
        Jaxb jaxb = new Jaxb();
        Validation validator = new Validation();
        SolarSystem solarSystem = new SolarSystem();

        client.startConnection(DEFAULT_IP, DEFAULT_PORT);
        client.sendFileRequest("RetrieveXmlDoc");

        if (validator.validateXMLSchema(DEFAULT_XSD_PATH, DEFAULT_XML_PATH)) {
            solarSystem = jaxb.transformToPOJO(DEFAULT_XML_PATH);
            System.out.print(solarSystem);
            
            jaxb.transformToXML(solarSystem);
            
            
        }

    }
}
