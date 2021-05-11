package lt.eif.viko.amiliauskis.jaxb.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Represents natural satellites object, which is a grandchild element of a
 * planet object. Holds a string variable - name.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class NaturalSatellite {

    private String name;

    /**
     * Getter for name
     *
     * @return name string
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     *
     * @param name string
     */
    @XmlElement(name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Formatted toString method for displaying Natural Satellite object and its
     * only variable - name.
     *
     * @return name string
     */
    @Override
    public String toString() {
        return String.format("\t\t\t\t Natural Satellite : \n \t\t\t\t\t name: \t %s", name);
    }
}
