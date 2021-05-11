package lt.eif.viko.amiliauskis.jaxb.model;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlElement;

/**
 * Represents stars objects list which is a child element of the solar system
 * root element. Contains a lists of star object
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class Stars {

    private List<Star> star;

    /**
     * Getter for star list
     *
     * @return star list
     */
    public List<Star> getStar() {
        return star;
    }

    /**
     * Setter for star list
     *
     * @param star list
     */
    @XmlElement(name = "Star")
    public void setStar(List<Star> star) {
        this.star = star;
    }

    /**
     * Formatted toString method for displaying stars list
     *
     * @return star list
     */
    @Override
    public String toString() {
        return String.format("\t   Stars: %s",
                star.stream().map(Object::toString).collect(Collectors.joining("\n")));
    }
}
