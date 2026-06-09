package com.achwi.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = Visit.tableName)
public class Visit {
    public static final String tableName = "VISIT";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "APPOINTMENT_ID", nullable = false)
    private Appointment appointment;

    @Column(name = "NOTES", length = 1000)
    private String notes;
}
