package com.achwi.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("GROUP")
public class PetGroup extends BasePet {

    @Column(name = "QUANTITY", nullable = false)
    private int quantity;
}
