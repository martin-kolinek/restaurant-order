package org.kolinek.restaurantorder;

import java.io.Serializable;

public class MenuItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private final int id;
	private final String name;
	private final String description;
	
	public MenuItem(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}
