package org.kolinek.restaurantorder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private final List<OrderItem> items;
	
	public Order(List<OrderItem> items) {
		this.items = Collections.unmodifiableList(new ArrayList<OrderItem>(items));
	}

	public List<OrderItem> getItems() {
		return items;
	}
}
