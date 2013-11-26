package org.kolinek.client;

import org.kolinek.restaurantorder.Menu;
import org.kolinek.restaurantorder.MenuItem;
import org.kolinek.restaurantorder.NoSuchItemException;
import org.kolinek.restaurantorder.Order;
import org.kolinek.restaurantorder.OrderItem;
import org.kolinek.restaurantorder.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

	public static void main(String args[]) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"client-context.xml");
		OrderService orderService = (OrderService) context
				.getBean("orderService");

		Menu m = orderService.getMenu();
		for (MenuItem mi : m.getItems()) {
			LOGGER.info("Item: {} {} {}", mi.getName(), mi.getDescription(),
					mi.getId());
		}

		Order o = new Order();
		o.getItems().add(new OrderItem(1, 3));
		orderService.placeOrder(o);
		o = new Order();
		o.getItems().add(new OrderItem(13, 2));
		try {
			orderService.placeOrder(o);
			LOGGER.error("Expected exception");
		} catch (NoSuchItemException e) {
			LOGGER.info("Exception as expected");
		}

		context.close();
		System.exit(0);
	}
}
