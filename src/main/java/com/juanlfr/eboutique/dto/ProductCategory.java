package com.juanlfr.eboutique.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
public class ProductCategory {

    private Long id;
    private String categoryName;
    private Set<Product> products;
}
