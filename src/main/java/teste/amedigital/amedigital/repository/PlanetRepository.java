package teste.amedigital.amedigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teste.amedigital.amedigital.domain.Planet;

public interface PlanetRepository extends JpaRepository<Planet, Long> {

}
