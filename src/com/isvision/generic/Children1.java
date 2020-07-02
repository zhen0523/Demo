package com.isvision.generic;

//保持子类得泛化特性
//子类的泛型可以比父类多，但父类的泛型子类必须包括
public class Children1<T2, T1, A> extends Father<T1, T2> {

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}

	//子类自定义属性，类型由子类定
	A a;
	String str;
	public void test2(A a) {
		System.out.println(a);
	}
}
