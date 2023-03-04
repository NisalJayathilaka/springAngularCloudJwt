package com.nisalj.providertypeservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "providerType")
public class ProviderTypeEntity {

    @Id
    @Column(name = "specialization_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "specialization_name")
    private String specializationName;

    public ProviderTypeEntity() {
    }

    public ProviderTypeEntity(int id, String specializationName) {
        this.id = id;
        this.specializationName = specializationName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }
}
