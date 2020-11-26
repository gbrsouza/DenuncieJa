package com.ufrn.ihc.denuncieja.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {
    private String street;
    private int number;
    private String neighborhood;
    private String zipCode;

}
