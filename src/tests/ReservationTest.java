package tests;

import customers.Address;
import data.CustomerData;
import data.Locations;

public class ReservationTest {

	public static void main(String[] args) {

		String customerName = "John";
		String customerLastName = "William";
		int customerAge = 29;
		
		int customerId = customerId(customerName, customerLastName, customerAge);
		boolean existingCustomer = existingUser(customerId);
		

		System.out.println(findLocation(existingCustomer,customerId).getCity());
		System.out.println(findLocation(existingCustomer,customerId).getState());


	}

	public static boolean existingUser(int customerId) {
		
		if(customerId > 0) {
			return true;
		}
		return false;

	}
	
	public static int customerId (String name, String lastName, int age) {
		
		for (int i = 0; i < CustomerData.names.length; i++) {
			if(CustomerData.names[i].equalsIgnoreCase(name)) {
				if(CustomerData.lastNames[i].equalsIgnoreCase(lastName)) {
					if(CustomerData.age[i] == age) {
						return i+1;
					}
				}
			}
		}
		
		return 0;
	}

	public static Address findLocation(boolean existingCustomer, int customerId) {
		Address address = new Address();
		if(existingCustomer) {
			for (int i = 0; i < Locations.states.length; i++) {
				if(customerId - 1 == i) {
					address.setCity(Locations.cities[i]);
					address.setState(Locations.states[i]);
				}
			}
		}
		
		return address;
	}
	
	
	
}
