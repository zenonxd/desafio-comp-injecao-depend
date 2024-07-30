package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;


    public void total(Order order) {
        System.out.println("Pedido código: " + order.getOrder());
        System.out.println("Valor total: " + shippingService.shipment(order));
    }
}
