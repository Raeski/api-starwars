package teste.amedigital.amedigital.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import teste.amedigital.amedigital.domain.Planet;
import teste.amedigital.amedigital.service.PlanetService;

import java.util.List;

@RestController
@RequestMapping("planets")
@Log4j2
@RequiredArgsConstructor
public class PlanetController {

    private final PlanetService planetService;


    @GetMapping
    public ResponseEntity<List<Planet>> list() {
        return ResponseEntity.ok(planetService.planetList());
    }

}
