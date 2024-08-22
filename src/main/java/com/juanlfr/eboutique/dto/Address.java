package com.juanlfr.eboutique.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private Long id;
    private String street;
    private String city;
    private String country;
    private Order order;
}






