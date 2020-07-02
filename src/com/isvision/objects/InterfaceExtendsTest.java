package com.isvision.objects;

interface interfaceA {
	int  PROP_A = 5;
	void testA();
}

interface interfaceB {
	int  PROP_B = 6;
	void testB();
}

//一个接口继承多个接口，写在extends之后，用逗号隔开
interface interfaceC extends interfaceA, interfaceB {
	int  PROP_C = 7;
	void testC();
}

public class InterfaceExtendsTest {
	public static void main(String[] args) {
		//子接口没有同名的static变量时，子类可以访问父类的static变量，但是不是继承
		System.out.println(interfaceC.PROP_C);
		System.out.println(interfaceC.PROP_B);
		System.out.println(interfaceC.PROP_A);
	}
}
