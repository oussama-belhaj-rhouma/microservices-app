package com.mycompany.app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Costumer {
    @Id
    @SequenceGenerator(
            name = "costumer_id_sequence",
            sequenceName = "costumer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "costumer_id_sequence"
    )
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
