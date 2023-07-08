package htwberlin.webtech.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class GewichtController {

    @Autowired
    GewichtService service;
    Logger logger = LoggerFactory.getLogger(GewichtController.class);

    @CrossOrigin
    @PostMapping("/add")
    public Gewicht createGewicht(@RequestBody Gewicht Gewicht) {
        return service.save(Gewicht);
    }

    @GetMapping("/gewicht/{id}")
    public Gewicht getGewicht(@PathVariable String id) {
        logger.info("GET request on route gewicht with {}", id);
        Long gewichtId = Long.parseLong(id);
        return service.get(gewichtId);
    }

    @CrossOrigin
    @GetMapping("/gewichte")
    public List<Gewicht> getAllGewicht() {
        return service.getAll();
    }


    @DeleteMapping("/delete/gewicht/{id}")
    public void deleteGewicht(@PathVariable("id") Long id) {
        service.deleteGewichtById(id);
    }
}
