package org.devsuperior.desafiocomponents;

import org.devsuperior.desafiocomponents.entities.Order;
import org.devsuperior.desafiocomponents.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioComponentsApplication implements CommandLineRunner {

	private final OrderService orderService;

	public DesafioComponentsApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {

		SpringApplication.run(DesafioComponentsApplication.class, args);
	}

	@Override
	public void run(String... args) {
     Order order = new Order(1034, 150.00, 20.00);
	 System.out.println("Pedido código " + order.getCode()  + " \nValor total: R$ " + String.format("%.2f", (orderService.total(order))));
	 Order order2 = new Order(2282, 800.0, 10.0);
	 System.out.println("Pedido código " + order2.getCode()  + " \nValor total: R$ " + String.format("%.2f", (orderService.total(order2))));
	 Order order3 = new Order(1309, 95.90, 0.0);
	 System.out.println("Pedido código " + order3.getCode()  + " \nValor total: R$ " + String.format("%.2f", (orderService.total(order3))));


	}
}
