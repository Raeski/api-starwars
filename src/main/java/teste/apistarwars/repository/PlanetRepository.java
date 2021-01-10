package teste.apistarwars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teste.apistarwars.domain.Planet;

public interface PlanetRepository extends JpaRepository<Planet, Long> {

}
