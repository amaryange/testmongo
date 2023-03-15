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
public class AdditionalContribution {

    @Id
    @GeneratedValue
    private UUID id;
    private Float contributionAmount;
    private String paymentMethod;
    private String periodicity;
    private LocalDate effectiveDate;
}
