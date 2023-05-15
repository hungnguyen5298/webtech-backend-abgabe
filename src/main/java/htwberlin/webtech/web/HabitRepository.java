package htwberlin.webtech.web;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitRepository extends CrudRepository<Habit, Long> { }
