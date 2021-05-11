package lt.eif.viko.amiliauskis.jaxb.model;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Represents planet object which is a child element of Inner planets element or
 * outer planets element. Has seven main properties: name, mass, mass unit,
 * volume, velocity, velocity unit and type and has one list: natural
 * satellites.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@XmlType(propOrder = {"name", "mass", "massUnit", "volume", "velocity", "velocityUnit", "type", "naturalSatellites"})
public class Planet {

    private String name;
    private Double mass;
    private String massUnit;
    private Double volume;
    private Integer velocity;
    private String velocityUnit;
    private String type;
    private List<NaturalSatellites> naturalSatellites;

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
     * Getter for mass
     *
     * @return mass double
     */
    public Double getMass() {
        return mass;
    }

    /**
     * Setter for mass
     *
     * @param mass double
     */
    @XmlElement(name = "Mass")
    public void setMass(Double mass) {
        this.mass = mass;
    }

    /**
     * Getter mass unit
     *
     * @return massUnit string
     */
    public String getMassUnit() {
        return massUnit;
    }

    /**
     * Setter for mass unit
     *
     * @param massUnit string
     */
    @XmlElement(name = "Mass-unit")
    public void setMassUnit(String massUnit) {
        this.massUnit = massUnit;
    }

    /**
     * Getter for volume
     *
     * @return volume double
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * Setter for volume
     *
     * @param volume double
     */
    @XmlElement(name = "Volume")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    /**
     * Getter for velocity
     *
     * @return velocity integer
     */
    public Integer getVelocity() {
        return velocity;
    }

    /**
     * Setter for velocity
     *
     * @param velocity integer
     */
    @XmlElement(name = "Velocity")
    public void setVelocity(Integer velocity) {
        this.velocity = velocity;
    }

    /**
     * Getter for velocity unit
     *
     * @return velocityUnit string
     */
    public String getVelocityUnit() {
        return velocityUnit;
    }

    /**
     * Setter for velocity unit
     *
     * @param velocityUnit string
     */
    @XmlElement(name = "Velocity-unit")
    public void setVelocityUnit(String velocityUnit) {
        this.velocityUnit = velocityUnit;
    }

    /**
     * Getter for type
     *
     * @return type string
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for type
     *
     * @param type string
     */
    @XmlElement(name = "Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for natural satellites list
     *
     * @return naturalSatellites list
     */
    public List<NaturalSatellites> getNaturalSatellites() {
        return naturalSatellites;
    }

    /**
     * Setter for natural satellites list
     *
     * @param naturalSatellites list
     */
    @XmlElement(name = "Natural-satellites")
    public void setNaturalSatellites(List<NaturalSatellites> naturalSatellites) {
        this.naturalSatellites = naturalSatellites;
    }

    /**
     * Formatted toString method for displaying planet object and its components
     * and for displaying a list of natural satellites if an object has one.
     *
     * @return name, mass, massUnit, volume, velocity, velocityUnit, type and
     * naturalSatellites
     */
    @Override
    public String toString() {
        try {
            return String.format("\n\t\t Planet: \n\t\t\t name: \t\t %s \n\t\t\t mass: \t\t %f"
                    + "\n\t\t\t massUnit: \t %s \n\t\t\t volume: \t %f \n\t\t\t velocity: \t %d"
                    + "\n\t\t\t velocityUnit: \t %s \n\t\t\t type: \t\t %s \n \t %s",
                    name, mass, massUnit, volume, velocity, velocityUnit, type,
                    naturalSatellites.stream().map(Object::toString).collect(Collectors.joining("\n")));
        } catch (NullPointerException e) {
            return String.format("\n\t\t Planet: \n\t\t\t name: \t\t %s \n\t\t\t mass: \t\t %f"
                    + "\n\t\t\t massUnit: \t %s \n\t\t\t volume: \t %f \n\t\t\t velocity: \t %d"
                    + "\n\t\t\t velocityUnit: \t %s \n\t\t\t type: \t\t %s",
                    name, mass, massUnit, volume, velocity, velocityUnit, type);
        }
    }
}
