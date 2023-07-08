package htwberlin.webtech.web;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZielGewichtRepository extends CrudRepository<ZielGewicht, Long> { }
