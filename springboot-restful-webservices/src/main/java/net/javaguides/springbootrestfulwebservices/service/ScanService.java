package net.javaguides.springbootrestfulwebservices.service;

import net.javaguides.springbootrestfulwebservices.entity.Scan;
import java.util.List;

public interface ScanService {
    Scan createScan(Scan scan);
    Scan getScanById(Long Id);
    List<Scan> getAllScans();
    //Scan updateScan(Long id, Scan scan);
    void deleteScan(Long Id);
}
