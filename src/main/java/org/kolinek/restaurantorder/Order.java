package org.kolinek.restaurantorder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<OrderItem> items;

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public Order() {
		items = new ArrayList<OrderItem>();
	}

	public Order(List<OrderItem> items) {
		this.items = new ArrayList<OrderItem>(items);
	}

	public List<OrderItem> getItems() {
		return items;
	}
}
