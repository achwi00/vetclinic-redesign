package com.achwi.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = BasePet.tableName)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "PET_KIND")
public abstract class BasePet {
    public static final String tableName = "BASE_PET";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OWNER_ID", nullable = false)
    private User owner;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean active;

    @Enumerated(EnumType.STRING)
    @Column(name = "SPECIES", nullable = false)
    private Species species;
}
