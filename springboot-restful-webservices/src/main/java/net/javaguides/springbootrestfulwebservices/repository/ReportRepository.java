package net.javaguides.springbootrestfulwebservices.repository;
import net.javaguides.springbootrestfulwebservices.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}

