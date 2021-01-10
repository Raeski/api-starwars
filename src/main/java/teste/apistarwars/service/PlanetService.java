package teste.apistarwars.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import teste.apistarwars.domain.Planet;
import teste.apistarwars.repository.PlanetRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanetService {

    private final PlanetRepository planetRepository;



    RestTemplate restTemplate = new RestTemplate();

    String url = "http://swapi.dev/api/planets/";

    public List<Planet> planetList (){
       return (List<Planet>) restTemplate.getForObject(url, PlanetRepository.class);
    }


    public List<Planet> listAll(){
        return planetRepository.findAll();
    }
}
