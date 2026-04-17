package com.achwi.domain.model;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("VACCINATION")
public class Vaccination extends Service {
  @ManyToOne
  @JoinColumn(name = "MEDICATION_ID", nullable = false)
  private Medication medication;
}
