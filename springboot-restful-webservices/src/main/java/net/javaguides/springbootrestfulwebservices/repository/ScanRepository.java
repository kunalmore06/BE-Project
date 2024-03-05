package net.javaguides.springbootrestfulwebservices.repository;

import net.javaguides.springbootrestfulwebservices.entity.Scan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScanRepository extends JpaRepository<Scan, Long> {
}