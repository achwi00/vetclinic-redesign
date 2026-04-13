package com.achwi.domain.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("PET")
public class Pet extends BasePet {

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEX", nullable = false)
    private Sex sex = Sex.UNDETERMINED;

    @Column(name = "NEUTERED")
    private Boolean neutered;
}
