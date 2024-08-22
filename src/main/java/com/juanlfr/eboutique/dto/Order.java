package com.juanlfr.eboutique.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
public class Order {

    private Long id;

    private String orderTrackingNumber;

    private int totalQuantity;

    private BigDecimal totalPrice;

    private String status;

    private Date dateCreated;


    private Date lastUpdated;

    private Set<OrderItem> orderItems = new HashSet<>();

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    public void add(OrderItem item) {

        if (item != null) {
            if (orderItems == null) {
                orderItems = new HashSet<>();
            }

            orderItems.add(item);
            item.setOrder(this);
        }
    }

}
