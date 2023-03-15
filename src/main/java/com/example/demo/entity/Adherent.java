package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Adherent {
    @Id
    @GeneratedValue
    private UUID id;

    private String civility;
    private String familyName;
    private String firstNames;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    private String employingOrganization;
    private String personnelNumber;
    private String socialSecurityNumber;
    private Integer numberOfChildren;
    private String telephoneContact;
    private String maritalStatus;
    private String email;
    private String geographicalAddress;
}
