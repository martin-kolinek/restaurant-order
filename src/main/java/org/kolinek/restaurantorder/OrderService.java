package org.kolinek.restaurantorder;

import javax.jws.WebService;

@WebService
public interface OrderService {
	Menu getMenu();
	
	void placeOrder(Order o) throws NoSuchItemException;
}
