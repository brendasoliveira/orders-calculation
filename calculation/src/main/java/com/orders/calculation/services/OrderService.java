package com.orders.calculation.services;

import com.orders.calculation.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - (order.getDiscount() / 100 * order.getBasic())
                + shippingService.shipment(order);
    }
}
