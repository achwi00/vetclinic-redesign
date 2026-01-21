package com.achwi.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = Service.tableName)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "SERVICE_TYPE")
public class Service {
  public static final String tableName = "SERVICE";

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Long id;

  private String name;

  private String description;

  private Long basePrice;
}
