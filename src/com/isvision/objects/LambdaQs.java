package com.isvision.objects;

interface Eatable {
	void teste();
}

interface Flyable {
	void fly(String weather);
}

interface Addable {
	int add(int a, int b);
}

public class LambdaQs {
	public void eat(Eatable e) {
		System.out.println(e);
		e.teste();
	}
	
	public void drive(Flyable f) {
		System.out.println("我正在驾驶：" + f);
		f.fly("[碧空如洗]");
	}
	
	public void test(Addable add) {
		System.out.println("5+3=" + add.add(5, 3));
	}
	
	public static void main(String[] args) {
		LambdaQs lq = new LambdaQs();
		//表达式中代码块只有一条语句，可省略花括号
		lq.eat(()->System.out.println("苹果的味道不错"));
		//表达式只有一个形参，可以省略小括号
		//打印的f是个Lambda表达式对象，Lambda表达式实际上可以被当成"任意类型"的对象，
		//代码块在接口调用唯一抽象方法时执行，weather是在调用fly方法时赋值
		lq.drive(weather->{
			System.out.println("今天天气是：" + weather);
			System.out.println("直升机飞行平稳");
		});
		//代码块中只有一条语句，可以省略return关键字
		lq.test((a, b)->a+b);
	}
}
