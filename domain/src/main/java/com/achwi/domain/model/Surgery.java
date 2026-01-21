package com.achwi.domain.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SURGERY")
public class Surgery extends Service {}
