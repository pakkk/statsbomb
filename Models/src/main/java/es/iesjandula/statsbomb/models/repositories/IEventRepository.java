package es.iesjandula.statsbomb.models.repositories;

import es.iesjandula.statsbomb.models.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventRepository extends JpaRepository<Event,String>
{
}
