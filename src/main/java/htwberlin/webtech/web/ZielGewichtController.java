package htwberlin.webtech.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ZielGewichtController {

    @Autowired
    ZielGewichtService service;
    Logger logger = LoggerFactory.getLogger(ZielGewichtController.class);

    @CrossOrigin
    @PostMapping("/addzielgewicht")
    public ZielGewicht createZielGewicht(@RequestBody ZielGewicht zielGewicht) {
        return service.save(zielGewicht);
    }

    @GetMapping("/zielgewicht/{id}")
    public ZielGewicht getZielGewicht(@PathVariable String id) {
        logger.info("GET request on route zielgewicht with {}", id);
        Long zielgewichtId = Long.parseLong(id);
        return service.get(zielgewichtId);
    }

    @CrossOrigin
    @GetMapping("/zielgewicht")
    public List<ZielGewicht> getAllZielGewicht() {
        return service.getAll();
    }


    @DeleteMapping("/delete/zielgewicht/{id}")
    public void deleteZielGewicht(@PathVariable("id") Long id) {
        service.deleteZielGewichtById(id);
    }

    @CrossOrigin
    @PutMapping("/zielgewicht/{id}")
    public ZielGewicht updateZielGewicht(@PathVariable("id") Long id, @RequestBody ZielGewicht updatedZielGewicht) {
        return service.updateZielGewicht(id, updatedZielGewicht);
    }
}
