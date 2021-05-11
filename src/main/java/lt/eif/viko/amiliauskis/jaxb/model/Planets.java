package lt.eif.viko.amiliauskis.jaxb.model;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlElement;

/**
 * Represents planet objects list which is a child element of the solar system
 * root element. Contains two lists : innerPlanets list and outerPlanets list.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class Planets {

    private List<InnerPlanets> innerPlanets;
    private List<OuterPlanets> outerPlanets;

    /**
     * Getter for inner planets list
     *
     * @return innerPlanets list
     */
    public List<InnerPlanets> getInnerPlanets() {
        return innerPlanets;
    }

    /**
     * Setter for inner planets list
     *
     * @param innerPlanets list
     */
    @XmlElement(name = "Inner-planets")
    public void setInnerPlanets(List<InnerPlanets> innerPlanets) {
        this.innerPlanets = innerPlanets;
    }

    /**
     * Getter for outer planets list
     *
     * @return outerPlanets list
     */
    public List<OuterPlanets> getOuterPlanets() {
        return outerPlanets;
    }

    /**
     * Setter for outer planets list
     *
     * @param outerPlanets list
     */
    @XmlElement(name = "Outer-planets")
    public void setOuterPlanets(List<OuterPlanets> outerPlanets) {
        this.outerPlanets = outerPlanets;
    }

    /**
     * Formatted toString method for displaying inner planets list and outer
     * planets list
     *
     * @return innerPlanets list, outerPlanets list
     */
    @Override
    public String toString() {
        return String.format("\t Planets: \n\t %s \n \t %s \n",
                innerPlanets.stream().map(Object::toString).collect(Collectors.joining("\n")),
                outerPlanets.stream().map(Object::toString).collect(Collectors.joining("\n")));
    }
}
