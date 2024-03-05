package net.javaguides.springbootrestfulwebservices.service.impl;
import lombok.AllArgsConstructor;
import net.javaguides.springbootrestfulwebservices.entity.Report;
import net.javaguides.springbootrestfulwebservices.repository.ReportRepository;
import net.javaguides.springbootrestfulwebservices.service.ReportService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ReportServiceImpl implements ReportService{
    // Dummy implementation
    private ReportRepository ReportRepository;

    @Override
    public Report createReport(Report report) {

        // Your implementation here
        return ReportRepository.save(report);
    }
    @Override
    public List<Report> getAllReports() {
        return ReportRepository.findAll();
    }

    @Override
    public Report updateReport(Report report) {
        Report existingReport = ReportRepository.findById(report.getId()).get();
        existingReport.setScanStartTime(report.getScanStartTime());
        existingReport.setScanEndTime(report.getScanEndTime());
        existingReport.setScanName(report.getScanName());
        existingReport.setDatastoreName(report.getDatastoreName());
        Report updatedReport = ReportRepository.save(existingReport);
        return updatedReport;
    }

    @Override
    public void deleteReport(Long id){
       ReportRepository.deleteById(id);
    }
}