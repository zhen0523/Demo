package com.isvision.objects;

public class ImmutableStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 = new Address("taipingjie", "111");
		Address address2 = new Address("taipingjie", "111");
		
		System.out.println(address1 == address2);
		System.out.println(address1.equals(address2));
		//两个hashcode值相同
		System.out.println(address1.hashCode());
		System.out.println(address2.hashCode());
	}

}
