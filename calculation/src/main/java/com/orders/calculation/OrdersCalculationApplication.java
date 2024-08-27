package com.orders.calculation;

import com.orders.calculation.entities.Order;
import com.orders.calculation.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdersCalculationApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrdersCalculationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Order order = new Order(1034, 150.00, 20.0);
//		Order order = new Order(2282, 800.00, 10.0);
		Order order = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));
	}
}
