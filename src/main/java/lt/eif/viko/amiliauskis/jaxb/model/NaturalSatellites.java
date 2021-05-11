package lt.eif.viko.amiliauskis.jaxb.model;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlElement;

/**
 * Represents natural satellite object list which is a child element of planet
 * object. Contains a list of natural satellites objects.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
public class NaturalSatellites {

    private List<NaturalSatellite> naturalSatellite;

    /**
     * Getter for natural satellites list.
     *
     * @return naturalSatellite list
     */
    public List<NaturalSatellite> getNaturalSatellite() {
        return naturalSatellite;
    }

    /**
     * Setter for natural satellites list.
     *
     * @param naturalSatellite list
     */
    @XmlElement(name = "Natural-satellite")
    public void setNaturalSatellite(List<NaturalSatellite> naturalSatellite) {
        this.naturalSatellite = naturalSatellite;
    }

    /**
     * Formatted toString method for displaying Natural satellites list
     *
     * @return naturalSatellites list
     */
    @Override
    public String toString() {
        return String.format("\t\t Natural satellites: \n %s",
                naturalSatellite.stream().map(Object::toString).collect(Collectors.joining("\n")));
    }
}
