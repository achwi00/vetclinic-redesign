package com.achwi.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("TREATMENT")
public class Treatment extends Service {
  @ManyToOne private Medication medication;

  @Column(name = "DOSE", nullable = false)
  private int dose;

  @Column(name = "NOTES")
  private String notes;
}
