package es.iesjandula.statsbomb.models.event;

import jakarta.persistence.*;

/**
 * @author Neil Hdez
 * @author Nacho Belda
 * This class almacenates information about the interception
 */
@Entity
@Table(name = "interception")
public class Interception
{
    /**
     * Id autogenerated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Attributes -
     * Id / Name for the attribute
     * option specifying the outcome
     * of the interception
     */
    @OneToOne(mappedBy = "interception")
    private OutCome outcome;

    /**
     * Empty constructor
     */
    Interception()
    {

    }

    /**
     * @return the information about the outcome
     */
    public OutCome getOutcome()
    {
        return outcome;
    }

    /**
     * @param outcome with the information about the outcome
     */
    public void setOutcome(OutCome outcome)
    {
        this.outcome = outcome;
    }

    /**
     * @return an instance of the class Interception as String
     */
    @Override
    public String toString()
    {
        return "Interception{" +
                "outcome=" + outcome +
                '}';
    }
}
