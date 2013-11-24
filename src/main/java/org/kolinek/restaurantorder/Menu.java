package org.kolinek.restaurantorder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;
	private final List<MenuItem> items;

	public Menu(List<MenuItem> items) {
		this.items = Collections
				.unmodifiableList(new ArrayList<MenuItem>(items));
	}

	public List<MenuItem> getItems() {
		return items;
	}
}
