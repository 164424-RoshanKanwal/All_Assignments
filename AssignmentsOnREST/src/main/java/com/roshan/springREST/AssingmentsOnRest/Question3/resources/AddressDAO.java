package com.roshan.springREST.AssingmentsOnRest.Question3.resources;

import java.util.ArrayList;
import java.util.List;

public class AddressDAO {

	public Address getUserAddress(long zip){
		List<Address> addressList = new ArrayList<Address>();
		addressList.add(new Address(123455, "Bangalore"," Hoodi", "India"));
		addressList.add(new Address(123456, "Bangalore4r"," Hoodia", "India"));
		addressList.add(new Address(123565, "Bangaloreg"," Hoodiu", "India"));
		
		Address address = null;
		for(Address addr : addressList){
			if(addr.getZipcode() == zip){
				address = addr;
				break;
			}
		}
		return address;
	}
	
}
