package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order) {
        double soma = 0.0;
        double discount = order.getDiscount() / 100;
        if (order.getBasic() < 100.0) {
            soma = order.getBasic() - (order.getBasic() * discount) + 20;
        } else if (order.getBasic() < 200) {
            soma = order.getBasic() - (order.getBasic() * discount) + 12;
        } else if (order.getBasic() >= 200.0) {
             soma = order.getBasic() - (order.getBasic() * discount);
        }
        return soma;
    }
}
