package com.isvision.objects;

//外部类只有两个作用域，public和省略
public class Cow {

	private double weight;
	public Cow() {}
	public Cow(double weight) {
		this.weight = weight;
	}
	
	//非静态内部类
	//内部类有4个作用域public protected private 省略
	//内部类可以加static，变成静态内部类
	private class CowLeg {
		//非静态内部类的两个实例变量
		private double length;
		private String color;
		
		//非静态内部类中不能包含静态成员
		//private static int 
		
		public CowLeg() {}
		public CowLeg(double length, String color) {
			this.length = length;
			this.color = color;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		public void info() {
			System.out.println("当前牛腿颜色是：" + color + ", 高" + length);
			//内部类可以直接访问外部类的private成员变量
			//非静态内部类访问变量时，先找有没有局部变量，再找有没有成员变量，最后到外部类中找同名的变量
			//当名字重复时，可用this和外部类.this来指定
			System.out.println("牛腿所在的奶牛重：" + weight);
		}
	}

	public void test() {
		//外部类不能访问非静态内部类中的变量，不管修饰符时什么
		//还可以这么理解，在外部类创建时，内部类还没有创建，所有不能访问
		//System.out.println("内部类color的值" + color);
		CowLeg cl = new CowLeg(1.12, "黑白相间");
		cl.info();
		//如果需要访问，可以显式创建内部类对象，访问也不管修饰符时什么，private也能访问
		System.out.println(cl.color);
	}
	
	public static void main(String[] args) {
		Cow cow = new Cow(378.9);
		cow.test();
	}
}
