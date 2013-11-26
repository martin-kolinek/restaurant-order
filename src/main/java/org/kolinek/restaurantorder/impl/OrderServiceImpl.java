package org.kolinek.restaurantorder.impl;

import javax.jws.WebService;
import org.apache.log4j.LogManager;
import org.kolinek.restaurantorder.Menu;
import org.kolinek.restaurantorder.MenuItem;
import org.kolinek.restaurantorder.NoSuchItemException;
import org.kolinek.restaurantorder.Order;
import org.kolinek.restaurantorder.OrderItem;
import org.kolinek.restaurantorder.OrderService;

@WebService(endpointInterface = "org.kolinek.restaurantorder.OrderService")
public class OrderServiceImpl implements OrderService {
	private Menu menu;

	public OrderServiceImpl() {
		this.menu = new Menu();
		this.menu.getItems().add(new MenuItem(0, "Salomon", "Smoked salomon"));
		this.menu.getItems().add(new MenuItem(1, "Steak", "Steak with potatoes"));
		this.menu.getItems().add(new MenuItem(2, "Fried chicken", "Fried chicken with fries"));
		
	}

	public Menu getMenu() {
		LogManager.getLogger(this.getClass()).info("sending menu with item count:"+menu.getItems().size());
		return menu;
	}

	public void placeOrder(Order o) throws NoSuchItemException {
		for (OrderItem i : o.getItems()) {
			boolean contains = false;
			for (MenuItem mi : menu.getItems()) {
				if (i.getId() == mi.getId())
					contains = true;
			}
			if (!contains)
				throw new NoSuchItemException(i.getId());
		}
	}
}
