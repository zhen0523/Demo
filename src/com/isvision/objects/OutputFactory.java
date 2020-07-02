package com.isvision.objects;

public class OutputFactory {
	public Output getOutput() {
		return new Printer();
	}
	
	public static void main(String[] args) {
		OutputFactory of = new OutputFactory();
		//Computer与Printer分离，Computer不负责创建Output对象，由工厂负责
		Computer c = new Computer(of.getOutput());
		c.keyIn("请谅解");
		c.keyIn("java");
		c.keyIn("hello");
		c.print();
	}
}
