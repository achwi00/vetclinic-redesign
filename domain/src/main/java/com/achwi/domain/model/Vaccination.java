package com.achwi.domain.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue("VACCINATION")
public class Vaccination extends Service {
  @ManyToOne private Medication medication;
}
