package es.iesjandula.statsbomb.models.event.substitution;

import es.iesjandula.statsbomb.models.event.OutCome;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * @author Neil Hdez
 * @author Alejandro Aljarilla
 * @author Oscar Herruzo
 * @version 1.0.0
 * @since 01/12/2022
 */
/**
 * Class about the substitution
 * and the replacement
 */
@Entity
@Table(name = "substitution")
public class Substitution
{
    /**
     * Id autogenerated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Attribute -
     * Object Outcome
     */
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private OutCome outCome;
    /**
     * Attribute -
     * Object replacement what has id and 
     * and name about replacement
     */
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Replacement replacement;
    /**
     * Attribute -
     * Object outcome what
     * has id and name 
     */
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private OutCome outcome;
    /**
     * Empty Constructor
     */
    Substitution()
    {

    }
    /**
     * @return object OutCome
     */
    public OutCome getOutcome()
    {
        return outcome;
    }
    /**
     * @param outcome set the object outcome
     */
    public void setOutcome(OutCome outcome)
    {
        this.outcome = outcome;
    }
    /**
     * @return the object OutCome
     */
    public OutCome getOutCome()
    {
        return outCome;
    }
    /**
     * @param outCome set the object outcome
     */
    public void setOutCome(OutCome outCome)
    {
        this.outCome = outCome;
    }
    /**
     * @return the object Replacement
     */
    public Replacement getReplacement()
    {
        return replacement;
    }
    /**
     * @param replacement set object replacement
     */
    public void setReplacement(Replacement replacement)
    {
        this.replacement = replacement;
    }
}
