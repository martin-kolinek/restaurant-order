package org.kolinek.restaurantorder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<MenuItem> items;

	public Menu() {
		this.items = new ArrayList<MenuItem>();
	}

	public List<MenuItem> getItems() {
		return items;
	}
	
	public void setItems(List<MenuItem> items) {
		this.items = items;
	}
}
