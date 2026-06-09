package com.achwi.domain.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * Entity representing a booked appointment.
 */

@Entity
@Table(name = Appointment.tableName)
public class Appointment {
    public static final String tableName = "APPOINTMENT";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "BASE_PET_ID",  nullable = false)
    private BasePet basePet;

    @ManyToOne
    @JoinColumn(name = "VET_ID",  nullable = false)
    private User vet;

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    private User client;

    @Column(name = "SCHEDULED_AT", nullable = false)
    private LocalDateTime scheduledAt;

    @Column(name = "STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @Column(name = "DURATION_IN_MINUTES", nullable = false)
    private Integer durationInMinutes = 30;

    @Enumerated(EnumType.STRING)
    @Column(name = "REASON", nullable = false, length = 20)
    private AppointmentReason reason;
}
