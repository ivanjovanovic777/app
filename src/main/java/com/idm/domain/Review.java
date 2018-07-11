package com.idm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

/**
 * Created by Ivan on 7/2/2018.
 */
@Entity
@Table(name = "review_mst", schema = "public")
@Data
public class Review {

    @Id
    @SequenceGenerator(name = "review_generator", sequenceName = "review_sequence")
    @GeneratedValue(generator = "review_generator")

    private int id;

    @ManyToOne
    private Company company;

    private String notes;

}
