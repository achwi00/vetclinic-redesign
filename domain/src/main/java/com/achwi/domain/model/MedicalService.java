package com.achwi.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = MedicalService.tableName)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "SERVICE_TYPE")
public class MedicalService {
    public static final String tableName = "SERVICE";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "BASE_PRICE", nullable = false)
    private BigDecimal basePrice;
}
