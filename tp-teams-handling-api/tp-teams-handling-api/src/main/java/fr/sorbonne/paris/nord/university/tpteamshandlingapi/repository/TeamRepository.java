package fr.sorbonne.paris.nord.university.tpteamshandlingapi.repository;

import fr.sorbonne.paris.nord.university.tpteamshandlingapi.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Integer> {
}
