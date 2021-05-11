package lt.eif.viko.amiliauskis.jaxb.model;

import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Represents solar system object which is the root element of the objects tree.
 * Contains three main properties: age, age unit and location and it has two
 * lists : stars and planets.
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@XmlType(propOrder = {"age", "ageUnit", "location", "stars", "planets"})
@XmlRootElement
public class SolarSystem {

    private Double age;
    private String ageUnit;
    private String location;
    private List<Stars> stars;
    private List<Planets> planets;
    
   
    /**
     * Getter for solar system's age
     *
     * @return age double
     */
    public Double getAge() {
        return age;
    }

    /**
     * Setter for solar system's age
     *
     * @param age double
     */
    @XmlElement(name = "Age")
    public void setAge(Double age) {
        this.age = age;
    }

    /**
     * Getter for solar system's age unit
     *
     * @return ageUnit string
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * Setter for solar system's age unit
     *
     * @param ageUnit string
     */
    @XmlElement(name = "Age-unit")
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * Getter for solar system's location
     *
     * @return location string
     */
    public String getLocation() {
        return location;
    }

    /**
     * Setter for solar system's location
     *
     * @param location string
     */
    @XmlElement(name = "Location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Getter for stars list
     *
     * @return stars list
     */
    public List<Stars> getStars() {
        return stars;
    }

    /**
     * Setter for stars list
     *
     * @param stars list
     */
    @XmlElement(name = "Stars")
    public void setStars(List<Stars> stars) {
        this.stars = stars;
    }

    /**
     * Getter for planets list
     *
     * @return planets list
     */
    public List<Planets> getPlanets() {
        return planets;
    }

    /**
     * Setter for planets list
     *
     * @param planets list
     */
    @XmlElement(name = "Planets")
    public void setPlanets(List<Planets> planets) {
        this.planets = planets;
    }

    /**
     * Formatted toString method for displaying solar system object and its
     * components which are age, age unit, location and stars and planets lists.
     *
     * @return age,ageUnit,Location, stars, planets;
     */
    @Override
    public String toString() {
        return String.format("\n\nSolarSystem: \n\t Age: \t\t %f \n\t AgeUnit:"
                + "\t %s \n\t Location: \t %s \n %s \n %s",
                age, ageUnit, location,
                stars.stream().map(Object::toString).collect(Collectors.joining("\n")),
                planets.stream().map(Object::toString).collect(Collectors.joining("\n")));
    }
}
