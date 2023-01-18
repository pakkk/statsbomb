package es.iesjandula.statsbomb.models.event;

/**
 * @author Neil Hdez
 * @author Jesus Guerrero
 *
 * An attempt to recover a loose ball
 */
public class BallRecovery
{
    /**
     * Attribute -
     * Ball is lost while attempting
     * to recover a loose ball
     */
    private Boolean recovery_failure;

    /* Attribute - if is offensive Ball Recovery */
    private Boolean offensive;

    /**
     * Empty Constructor
     */
    public BallRecovery()
    {

    }

    /**
     * @return a boolean if the ball recovery was success
     */
    public Boolean getRecovery_failure()
    {
        return this.recovery_failure;
    }

    /**
     *
     * @param recovery_failure is a boolean if the ball recovery was success
     */
    public void setRecovery_failure(Boolean recovery_failure)
    {
        this.recovery_failure = recovery_failure;
    }

    public Boolean getOffensive()
    {
        return this.offensive;
    }

    public void setOffensive(Boolean offensive)
    {
        this.offensive = offensive;
    }

    /**
     * @return the instance of BallRecovery as String
     */
    @Override
    public String toString()
    {
        return "BallRecovery{" + "recovery_failure=" + recovery_failure + '}';
    }
}
