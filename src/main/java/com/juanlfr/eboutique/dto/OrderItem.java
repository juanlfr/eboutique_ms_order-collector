package com.juanlfr.eboutique.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderItem {

    private Long id;

    private String imageUrl;

    private BigDecimal unitPrice;

    private int quantity;

    private Long productId;

    private Order order;

}
