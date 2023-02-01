package es.iesjandula.statsbomb.models.event;

import jakarta.persistence.*;

@Entity
@Table(name = "mis_control")
public class MisControl
{
    /**
     * Id autogenerated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Attribute -
     *
     */
    @Column(length = 1)
    private Boolean aerial_won;

    @OneToOne(mappedBy = "mis_control")
    private Event event;

    /**
     * Default Constructor
     */
    public MisControl() {
    }

    /**
     * @return
     */
    public Boolean isAerial_won() {
        return aerial_won;
    }

    /**
     * @param aerial_won
     */
    public void setAerial_won(Boolean aerial_won) {
        this.aerial_won = aerial_won;
    }

    /**
     * @return the instance of Miscontrol as String
     */
    @Override
    public String toString() {
        return "Miscontrol{" +
                "aerial_won=" + aerial_won +
                '}';
    }
}
