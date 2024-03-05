package net.javaguides.springbootrestfulwebservices.controller;

import lombok.AllArgsConstructor;
import net.javaguides.springbootrestfulwebservices.entity.Report;
import net.javaguides.springbootrestfulwebservices.entity.User;
import net.javaguides.springbootrestfulwebservices.service.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reports")
public class ReportController {
    private ReportService reportService;

    @PostMapping
    public ResponseEntity<Report> createReport(@RequestBody Report report) {
        Report createdReport = reportService.createReport(report);
        return new ResponseEntity<>(createdReport, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Report>> getAllReports() {
        List<Report> reports = reportService.getAllReports();
        return new ResponseEntity<>(reports, HttpStatus.OK);
    }

    @PutMapping("{id}")

    public ResponseEntity<Report> updateReport(@PathVariable("id") Long reportId,
                                           @RequestBody Report report){
        report.setId(reportId);
        Report updatedReport = reportService.updateReport(report);
        return new ResponseEntity<>(updatedReport, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteReport(@PathVariable("id") Long reportId) {
        reportService.deleteReport(reportId);
        return new ResponseEntity<>("Report successfully deleted!", HttpStatus.OK);
    }
}

