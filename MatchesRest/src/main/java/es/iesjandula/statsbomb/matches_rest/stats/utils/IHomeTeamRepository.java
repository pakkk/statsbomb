package es.iesjandula.statsbomb.matches_rest.stats.utils;

import es.iesjandula.statsbomb.models.matches.HomeTeam;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Neil Hdez
 * @version 1.0.0
 * @since 02/02/2023
 */
public interface IHomeTeamRepository extends JpaRepository<HomeTeam, Integer>
{
}
