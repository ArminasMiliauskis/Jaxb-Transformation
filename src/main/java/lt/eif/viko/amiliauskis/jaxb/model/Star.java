package lt.eif.viko.amiliauskis.jaxb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Represents star object which is a child element of stars element. Has seven
 * main properties : name, mass, massUnit, volume, age, velocity and
 * velocityUnit
 *
 * @author Arminas Miliauskis
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@XmlType(propOrder = {"name", "mass", "massUnit", "volume", "age", "velocity", "velocityUnit"})
public class Star {

    private String name;
    private Integer mass;
    private String massUnit;
    private Integer volume;
    private Long age;
    private Integer velocity;
    private String velocityUnit;

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
     * @return mass integer
     */
    public Integer getMass() {
        return mass;
    }

    /**
     * Setter for mass
     *
     * @param mass integer
     */
    @XmlElement(name = "Mass")
    public void setMass(Integer mass) {
        this.mass = mass;
    }

    /**
     * Getter for mass unit
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
     * @return volume integer
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * Setter for volume
     *
     * @param volume integer
     */
    @XmlElement(name = "Volume")
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    /**
     * Getter for age
     *
     * @return age long
     */
    public Long getAge() {
        return age;
    }

    /**
     * Setter for age
     *
     * @param age long
     */
    @XmlElement(name = "Age")
    public void setAge(Long age) {
        this.age = age;
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
     * Formatted toString method for displaying star object and its components :
     * name, mass, massUnit, volume, age, velocity and velocityUnit. * @return
     * name, mass, massUnit, volume, age, velocity and velocityUnit
     */
    @Override
    public String toString() {
        return String.format("\n\t\t  Star:  \n \t \t \t name: \t\t" + name + "\n \t \t \t mass: \t\t"
                + mass + "\n \t \t \t massUnit: \t" + massUnit + "\n \t \t \t volume: \t"
                + volume + "\n \t \t \t age: \t\t" + age + "\n \t \t \t velocity: \t"
                + velocity + "\n \t \t \t velocityUnit:  " + velocityUnit);
    }
}
