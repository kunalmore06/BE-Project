package net.javaguides.springbootrestfulwebservices.service;

import net.javaguides.springbootrestfulwebservices.entity.Report;
import net.javaguides.springbootrestfulwebservices.entity.User;

import java.util.List;

public interface ReportService {
    Report createReport(Report report);

    List<Report> getAllReports();

    Report updateReport(Report report);

    void deleteReport(Long id);
}
