package com.achwi.domain.model;

import jakarta.persistence.*;

/**
 * Represents a medication that can be prescribed. Maps to the MEDICATION table in the database.
 * Each medication has a unit (e.g. ML, MG) describing the measurement type.
 */
@Entity
@Table(name = Medication.tableName)
public class Medication {
  public static final String tableName = "MEDICATION";

  @Id
  @Column(name = "ID")
  private Long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "DESCRIPTION")
  private String description;

  @Enumerated(EnumType.STRING)
  @Column(name = "UNIT")
  private Unit unit;
}
