package net.javaguides.springbootrestfulwebservices.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Scan {

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        private Long id;
        private String datastoreId;
        // Add other relevant fields

}
