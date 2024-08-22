package com.juanlfr.eboutique.resources;


import com.juanlfr.eboutique.dto.Purchase;
import com.juanlfr.eboutique.dto.PurchaseResponse;
import com.juanlfr.eboutique.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orderCollect/")
@CrossOrigin("http://localhost:4200")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public PurchaseResponse checkout(@RequestBody Purchase purchase){
        return orderService.processOrder(purchase);
    }

}
