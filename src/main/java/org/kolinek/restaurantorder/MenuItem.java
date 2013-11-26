package org.kolinek.restaurantorder;

import java.io.Serializable;

public class MenuItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String description;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MenuItem() {
	}
	
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
