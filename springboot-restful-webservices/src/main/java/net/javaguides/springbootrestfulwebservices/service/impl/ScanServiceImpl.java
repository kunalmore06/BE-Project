package net.javaguides.springbootrestfulwebservices.service.impl;
import net.javaguides.springbootrestfulwebservices.entity.Scan;
import net.javaguides.springbootrestfulwebservices.repository.ScanRepository;
import net.javaguides.springbootrestfulwebservices.service.ScanService;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import java.util.List;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ScanServiceImpl implements ScanService {

    private ScanRepository ScanRepository;


    @Override
    public Scan createScan(Scan scan) {
        return ScanRepository.save(scan);
    }

    @Override
    public Scan getScanById(Long id) {
        Optional<Scan> optionalScan;
        optionalScan = ScanRepository.findById(id);
        return optionalScan.get();
    }



    @Override
    public List<Scan> getAllScans() {
        return ScanRepository.findAll();
    }

    /*@Override
    public Scan updateScan(Long id, Scan scan) {
        Scan existingScan = ScanRepository.findById(Scan.getId()).get();
        Scan updatedScan = ScanRepository.save(existingScan);

        return scan;
    }*/

    @Override
    public void deleteScan(Long id) {
        ScanRepository.deleteById(id);
    }
}
