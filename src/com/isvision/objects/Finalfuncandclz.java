package com.isvision.objects;

class PrivateFinalMethodTest {
	public final void test1(){}
	private final void test2(){}
}

class Sub extends PrivateFinalMethodTest {
	//子类不能重写父类的final方法
	//public void test1(){}
	//因为父类中的test2方法是私有的，所以对子类是不可见得，子类中的同名方法其实跟父类没有关系，只是定义了一个新方法
	public void test2(){}
}

public class Finalfuncandclz {
	public static void main(String[] args) {
		
	}
}
