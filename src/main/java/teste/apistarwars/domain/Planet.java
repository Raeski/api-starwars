package teste.apistarwars.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Planet {

    private String name;

    private String rotation_period;

    private String orbital_period;

    private String diameter;

    private String climate;

    private String gravity;

    private String terrain;

    private String surface_water;

    private String population;

    private String residents;

    private String films;

    private String created;

    private String edited;

    private String url;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;


}
