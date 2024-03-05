package net.javaguides.springbootrestfulwebservices.repository;

import net.javaguides.springbootrestfulwebservices.entity.Datastore;
import net.javaguides.springbootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatastoreRepository extends JpaRepository<Datastore, Long> {
}