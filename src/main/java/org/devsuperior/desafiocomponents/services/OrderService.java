package org.devsuperior.desafiocomponents.services;

import org.devsuperior.desafiocomponents.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	private final ShippingService shippingService;

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public double total(Order order) {

		return order.getBasic() - (order.getBasic() * order.getDiscount() / 100) + shippingService.shipment(order);
	}
}
