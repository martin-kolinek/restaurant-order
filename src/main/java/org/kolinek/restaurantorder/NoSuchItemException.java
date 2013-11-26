package org.kolinek.restaurantorder;

public class NoSuchItemException extends Exception {
	private static final long serialVersionUID = 1L;

	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public NoSuchItemException() {
	}

	public NoSuchItemException(int id) {
		super("No such item on the menu: " + id);
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
