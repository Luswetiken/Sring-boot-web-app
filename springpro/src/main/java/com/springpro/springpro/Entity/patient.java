package com.springpro.springpro.Entity;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name= "patient_DB")
@NoArgsConstructor
@AllArgsConstructor

public class patient {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "identification_type")
    private String identificationType;
    @Column(name = "identification_number")
    private String identificationNumber;



}
