package lt.eif.viko.amiliauskis.jaxb.transform;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

/**
 * XML document validation class. Has one method which validates XML document
 * against XSD schema
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class Validation {

    /**
     * Validates XML document against an XSD schema. Creates a validator using
     * schema factory, then validates specified XML document with a specified
     * XSD schema, if it validates returns true, otherwise return false
     *
     * @param xsdPath XSD schema path for validation
     * @param xmlPath XML document path 
     * @return true if the document validates and false if it doesn't
     *
     */
    public boolean validateXMLSchema(String xsdPath, String xmlPath) {

        try {
            SchemaFactory factory
                    = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException ex) {
            System.out.println("Exception: " + ex.getMessage());
            return false;
        }
        return true;
    }
}
