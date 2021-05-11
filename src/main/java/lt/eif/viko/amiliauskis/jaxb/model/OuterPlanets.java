package lt.eif.viko.amiliauskis.jaxb.model;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlElement;

/**
 * Represents outer planets objects list which is a child element of planets
 * list. Has one list called planet which contains planet objects.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class OuterPlanets {

    private List<Planet> planet;

    /**
     * Getter for planet list
     *
     * @return planet list
     */
    public List<Planet> getPlanet() {
        return planet;
    }

    /**
     * Setter for planet list
     *
     * @param planet list
     */
    @XmlElement(name = "Planet")
    public void setPlanet(List<Planet> planet) {
        this.planet = planet;
    }

    /**
     * Formatted toString method for displaying outer planets list and planet
     * objects.
     *
     * @return planet list
     */
    @Override
    public String toString() {
        return String.format("Outer planets: \n\t %s",
                planet.stream().map(Object::toString).collect(Collectors.joining("\n")));
    }
}
