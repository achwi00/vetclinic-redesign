package com.achwi.domain.model;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("TREATMENT")
public class Treatment extends Service {
    @ManyToOne
    @JoinColumn(name = "MEDICATION_ID", nullable = false)
    private Medication medication;

    @Column(name = "DOSE", nullable = false)
    private int dose;

    @Column(name = "NOTES")
    private String notes;
}
