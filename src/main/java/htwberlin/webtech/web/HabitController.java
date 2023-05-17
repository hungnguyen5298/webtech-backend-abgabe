package htwberlin.webtech.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HabitController {

    @Autowired
    HabitService service;
    Logger logger = LoggerFactory.getLogger(HabitController.class);

    @PostMapping("/add")
    public Habit createHabit(@RequestBody Habit habit) {
        return service.save(habit);
    }

    @GetMapping("/habits/{id}")
    public Habit getHabit(@PathVariable String id) {
        logger.info("GET request on route habits with {}", id);
        Long habitId = Long.parseLong(id);
        return service.get(habitId);
    }

    @GetMapping("/habits")
    public List<Habit> getAllHabits() {
        return service.getAll();
    }
}
