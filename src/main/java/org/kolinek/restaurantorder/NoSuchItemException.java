package org.kolinek.restaurantorder;

public class NoSuchItemException extends Exception {
	private static final long serialVersionUID = 1L;

	private final int id;

	public NoSuchItemException(int id) {
		super("No such item on the menu: "+id);
		this.id = id;
	}

	public int getId() {
		return id;
	}	
}
