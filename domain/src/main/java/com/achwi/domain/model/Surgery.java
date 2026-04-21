package com.achwi.domain.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * Represents a surgical procedure.
 */
@Entity
@DiscriminatorValue("SURGERY")
public class Surgery extends MedicalService {
}
