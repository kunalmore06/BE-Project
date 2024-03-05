package net.javaguides.springbootrestfulwebservices.service.impl;


import lombok.AllArgsConstructor;
import lombok.Data;
import net.javaguides.springbootrestfulwebservices.entity.Datastore;
import net.javaguides.springbootrestfulwebservices.repository.DatastoreRepository;
import net.javaguides.springbootrestfulwebservices.service.DatastoreService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DatastoreServiceImpl implements DatastoreService {

    private DatastoreRepository datastoreRepository;

    @Override
    public Datastore createDatastore(Datastore datastore) {
        return datastoreRepository.save(datastore);
    }

    @Override
    public Datastore getDatastoreById(Long datastoreId) {
        Optional<Datastore> optionalDatastore =
                datastoreRepository.findById(datastoreId);
        return optionalDatastore.get();
    }

    @Override
    public List<Datastore> getAllDatastores() {
        return datastoreRepository.findAll();
    }

    @Override
    public Datastore updateDatastore(Datastore datastore) {
        Datastore existingDatastore =
                datastoreRepository.findById(datastore.getId()).get();
        existingDatastore.setDatastoreName(datastore.getDatastoreName());
        existingDatastore.setDatastoreType(datastore.getDatastoreType());
        existingDatastore.setDatastoreDetails(datastore.getDatastoreDetails());
        Datastore updatedDatastore = datastoreRepository.save(existingDatastore);
        return updatedDatastore;
    }

    @Override
    public void deleteDatastore(Long datastoreId) {
        datastoreRepository.deleteById(datastoreId);
    }
}