package com.idm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "company_mst", schema = "public")
@Data
public class Company {

    @Id
    @SequenceGenerator(name = "company_generator", sequenceName = "company_sequence")
    @GeneratedValue(generator = "company_generator")
    private int id;

    private String name;

    private String address;

    private long pib;

    private String phone;

    public Company() {

    }

    public Company(int id) {

        this.id = id;
    }
}
