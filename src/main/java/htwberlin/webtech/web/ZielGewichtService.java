package htwberlin.webtech.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZielGewichtService {
    @Autowired
    ZielGewichtRepository repo;

    public ZielGewicht save(ZielGewicht zielGewicht){
        return repo.save(zielGewicht);
    }

    public ZielGewicht get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<ZielGewicht> getAll() {
        Iterable<ZielGewicht> iterator = repo.findAll();
        List<ZielGewicht> allgewicht = new ArrayList<ZielGewicht>();
        for (ZielGewicht gewicht : iterator)  allgewicht.add(gewicht);
        return allgewicht;
    }

    public void deleteZielGewichtById(Long id) {
        repo.deleteById(id);
    }

    public ZielGewicht updateZielGewicht(Long id, ZielGewicht updatedZielGewicht) {
        ZielGewicht existingZielGewicht = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("ZielGewicht with ID " + id + " not found"));
        existingZielGewicht.setZielKilo(updatedZielGewicht.getZielKilo());
        return repo.save(existingZielGewicht);
    }

}
