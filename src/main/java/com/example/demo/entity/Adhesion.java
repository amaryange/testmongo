package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Adhesion {
    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adherent", referencedColumnName = "id")
    private Adherent adherent;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "additional", referencedColumnName = "id")
    private AdditionalContribution additionalContribution;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<RightfulClaimant> rightfulClaimants;
    private LocalDateTime date;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "signature", referencedColumnName = "id")
    private Document signature;
    private String status;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Document> documents;

    private String actor;

    @Column(nullable = false, unique = true)
    private String pid;
}
