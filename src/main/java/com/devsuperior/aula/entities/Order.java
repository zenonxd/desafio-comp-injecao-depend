package com.devsuperior.aula.entities;

import org.springframework.stereotype.Component;

@Component
public class Order {
    private Integer order;
    private Double basic;
    private Double discount;

    private Order() {}

    public Order(Integer order, Double basic, Double discount) {
        this.order = order;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
