package week1;

import java.util.HashMap;
import java.util.Map;

import week1.domain.value.PhoneNumber;

public class HashCodeExperiment {

	public static void main(String[] args) {

		PhoneNumber phoneNumber1 = new PhoneNumber(1, 1, 1);

		Map<PhoneNumber, String> map = new HashMap<PhoneNumber, String>();
		map.put(phoneNumber1, "John");

		PhoneNumber key = new PhoneNumber(1, 1, 1);
		//TODO5: override hashCode of PhoneNumber return "John"
		System.out.println(map.get(key));

		System.out.println("phoneNumber1.hashCode()" + phoneNumber1.hashCode());
		System.out.println("key.hashCode()" + key.hashCode());

	}

}
