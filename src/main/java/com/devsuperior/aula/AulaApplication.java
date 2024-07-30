package com.devsuperior.aula;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;
import com.devsuperior.aula.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

    @Autowired
    private ShippingService shippingService;
    @Autowired
    private OrderService orderService;


    public static void main(String[] args) {
        SpringApplication.run(AulaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int order = sc.nextInt();
        double basic = sc.nextDouble();
        double discount = sc.nextDouble();

        Order order1 = new Order(order, basic, discount);
        shippingService.shipment(order1);
        orderService.total(order1);

        sc.close();
    }
}
