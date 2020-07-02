package com.isvision.objects;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public void SetRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "圆形";
	}

	public static void main(String[] args) {
		Shape s1 = new Triangle("黑色", 3, 4, 5);
		Shape s2 = new Circle("黄色", 3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
}
