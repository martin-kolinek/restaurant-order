package org.kolinek.restaurantorder;

import java.io.Serializable;

public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private final int id;
	private final int quantity;
	
	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public OrderItem(int id, int quantity) {
		this.id = id;
		this.quantity = quantity;
	}
}
