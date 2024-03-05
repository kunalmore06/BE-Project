package net.javaguides.springbootrestfulwebservices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "datastore")
public class Datastore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String datastoreName;
    @Column(nullable = false)
    private String datastoreType;
    @Column(nullable = false)
    private String datastoreDetails;
}