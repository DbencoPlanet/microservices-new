package com.dbencotech.orderservice.controller;

import com.dbencotech.orderservice.dto.OrderRequest;
import com.dbencotech.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest ){
        orderService.placeOrder(orderRequest);
        return "Order place successfully";
    }
}
