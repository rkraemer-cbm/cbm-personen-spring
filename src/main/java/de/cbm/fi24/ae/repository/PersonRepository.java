package de.cbm.fi24.ae.repository;

import de.cbm.fi24.ae.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
