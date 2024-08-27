package com.orders.calculation.services;

import com.orders.calculation.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private double shipment(Order order) {
        if (order.getBasic() < 100.00) {
            return 27.00;
        }
        else if (order.getBasic() >= 100.00 & order.getBasic() < 200.00) {
            return 12.00;
        }
        return 0;
    }
}
