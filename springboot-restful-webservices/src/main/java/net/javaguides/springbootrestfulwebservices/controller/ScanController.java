package net.javaguides.springbootrestfulwebservices.controller;

import lombok.AllArgsConstructor;
import net.javaguides.springbootrestfulwebservices.entity.Scan;
import net.javaguides.springbootrestfulwebservices.service.ScanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/scans")
public class ScanController {

    private final ScanService scanService;

    @PostMapping
    public ResponseEntity<Scan> createScan(@RequestBody Scan scan){
        Scan savedScan = scanService.createScan(scan);
        return new ResponseEntity<>(savedScan, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Scan> getScanById(@PathVariable("id") Long scanId){
        Scan scan = scanService.getScanById(scanId);
        return scan != null ? new ResponseEntity<>(scan, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<Scan>> getAllScans(){
        List<Scan> scans = scanService.getAllScans();
        return new ResponseEntity<>(scans, HttpStatus.OK);
    }

   /* @PutMapping("{id}")
    public ResponseEntity<Scan> updateScan(@PathVariable("id") Long scanId,
                                           @RequestBody Scan scan){
        Scan updatedScan = scanService.updateScan(scanId, scan);
        return updatedScan != null ? new ResponseEntity<>(updatedScan, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }*/

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteScan(@PathVariable("id") Long scanId){
        scanService.deleteScan(scanId);
        return new ResponseEntity<>("Scan successfully deleted!", HttpStatus.OK);
    }
}
