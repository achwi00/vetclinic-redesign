package com.achwi.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 * Base entity representing a medical service offered by the clinic.
 * Acts as a parent for all specific service types such as treatments, vaccinations, and surgeries.
 */
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
