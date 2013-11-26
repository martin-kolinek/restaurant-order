package org.kolinek.restaurantorder;

import java.io.Serializable;

public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int quantity;

	public void setId(int id) {
		this.id = id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

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

	public OrderItem() {

	}
}
