package com.isvision.objects;

public abstract class Shape {
	//抽象类中可以包含成员变量、成员方法、抽象方法、构造器、初始化块、内部类（接口、枚举）
	//被abstract修饰的类就是抽象类，即使类中没有抽象方法
	//抽象类不能被实例化
	//abstract不能用于修饰成员变量和局部变量，也不能修饰构造器
	//abstract和static不能同时用于修饰某个方法，因为父类的static方法是不能被子类继承的，又因为abstract方法没有方法体，所以不能用类名直接调用此方法。
	//但是子类没有相同的static方法或者成员变量时，子类时可以访问父类的static方法或者成员变量的
	//abstract和private不能同时用于修饰某个方法,因为private方法不能被子类重写，所以该方法永远没有方法体
	{
		System.out.println("执行Shape的初始化代码块");
	}
	
	private String color;
	
	//被abstract修饰的方法是抽象方法
	public abstract double calPerimeter();
	public abstract String getType();
	
	//为了给子类提供默认构造器
	public Shape() {
		System.out.println("先执行代码块，再执行构造函数");
	}
	
	public Shape(String color) {
		System.out.println("执行Shape构造器");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
