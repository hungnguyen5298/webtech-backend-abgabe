package htwberlin.webtech.web;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GewichtRepository extends CrudRepository<Gewicht, Long> { }
