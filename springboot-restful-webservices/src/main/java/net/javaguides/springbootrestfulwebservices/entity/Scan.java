package net.javaguides.springbootrestfulwebservices.entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Scan {

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String datastoreId;
        // Add other relevant fields

}
