package es.iesjandula.statsbomb.models.matches;

/**
 * @author Nacho Belda
 */
public class Referee
{
    /**
     * Attributes -
     * The ID is the unique identifier for the stadium and the name is the name of the stadium
     */
    private int id;
    private String name;

    /** Attribute -
     * The ID is the unique identifier for the country and the name is
     * the name of the country
     */
    private Country country;

    /**
     * Empty Constructor
     */
    public Referee()
    {
    }

    /**
     * @return the information about the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id with the information about the id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the information about the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name with the information about the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the information about the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country with the information about the country
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return an instance of the class Referee as String
     */
    @Override
    public String toString() {
        return "Referee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}