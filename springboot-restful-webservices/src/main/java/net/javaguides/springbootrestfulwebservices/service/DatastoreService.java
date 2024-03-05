package net.javaguides.springbootrestfulwebservices.service;

import net.javaguides.springbootrestfulwebservices.entity.Datastore;

import java.util.List;

public interface DatastoreService {
    Datastore createDatastore(Datastore datastore);

    Datastore getDatastoreById(Long datastoreId);

    List<Datastore> getAllDatastores();

    Datastore updateDatastore(Datastore datastore);

    void deleteDatastore(Long datastoreId);
}