package htwberlin.webtech.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GewichtService {
    @Autowired
    GewichtRepository repo;

    public Gewicht save(Gewicht Gewicht){
        return repo.save(Gewicht);
    }

    public Gewicht get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Gewicht> getAll() {
        Iterable<Gewicht> iterator = repo.findAll();
        List<Gewicht> allgewicht = new ArrayList<Gewicht>();
        for (Gewicht gewicht : iterator)  allgewicht.add(gewicht);
        return allgewicht;
    }

    public void deleteGewichtById(Long id) {
        repo.deleteById(id);
    }
}
