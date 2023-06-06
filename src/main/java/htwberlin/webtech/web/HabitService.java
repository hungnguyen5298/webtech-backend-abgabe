package htwberlin.webtech.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HabitService {
    @Autowired
    HabitRepository repo;

    public Habit save(Habit habit){
        return repo.save(habit);
    }

    public Habit get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Habit> getAll() {
        Iterable<Habit> iterator = repo.findAll();
        List<Habit> things = new ArrayList<Habit>();
        for (Habit thing : iterator)  things.add(thing);
        return things;
    }

    public void deleteHabitById(Long id) {
        repo.deleteById(id);
    }
}
