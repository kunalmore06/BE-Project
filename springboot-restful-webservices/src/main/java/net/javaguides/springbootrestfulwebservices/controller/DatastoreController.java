package net.javaguides.springbootrestfulwebservices.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.javaguides.springbootrestfulwebservices.entity.Datastore;
import net.javaguides.springbootrestfulwebservices.service.DatastoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/datastore")
public class DatastoreController {

    private DatastoreService datastoreService;

    // build create User REST API
    @PostMapping
    public ResponseEntity<Datastore> createDatastore(@RequestBody Datastore datastore){
        Datastore savedDatastore = datastoreService.createDatastore(datastore);
        return new ResponseEntity<>(savedDatastore, HttpStatus.CREATED);
    }

    // build get user by id REST API
    // http://localhost:8080/api/users/1
    @GetMapping("{id}")
    public ResponseEntity<Datastore> getDatastoreById(@PathVariable("id") Long datastoreId){
        Datastore datastore = datastoreService.getDatastoreById(datastoreId);
        return new ResponseEntity<>(datastore, HttpStatus.OK);
    }

    // Build Get All Users REST API
    // http://localhost:8080/api/users
    @GetMapping
    public ResponseEntity<List<Datastore>> getAllDatastores(){
        List<Datastore> datastores = datastoreService.getAllDatastores();
        return new ResponseEntity<>(datastores, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/users/1
    public ResponseEntity<Datastore> updateDatastore(@PathVariable("id") Long datastoreId,
                                           @RequestBody Datastore datastore){
        datastore.setId(datastoreId);
        Datastore updatedDatastore =
                datastoreService.updateDatastore(datastore);
        return new ResponseEntity<>(updatedDatastore, HttpStatus.OK);
    }

    // Build Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDatastore(@PathVariable("id") Long datastoreId){
        datastoreService.deleteDatastore(datastoreId);
        return new ResponseEntity<>("Datastore successfully deleted!",
                HttpStatus.OK);
    }
}