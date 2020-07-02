package com.isvision.objects;

interface Product {
	int  getProduceTime();
}

//实现接口用implement
public class Printer implements Output, Product {
	private String[] printData = new String[MAX_CACHE_LINE];
	private int dataNum = 0;
	
	@Override
	public int getProduceTime() {
		// TODO Auto-generated method stub
		return 45;
	}

	//子类重写父类的方法时访问权限只能等于或者更大。所以实现接口中的方法的只能是public访问权限
	@Override
	public void out() {
		// TODO Auto-generated method stub
		while(dataNum > 0) {
			System.out.println("打印机打印：" + printData[0]);
			//原数组 拷贝的起始位置 目标数组 目标位置 拷贝长度
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	@Override
	public void getData(String msg) {
		// TODO Auto-generated method stub
		if(dataNum >= MAX_CACHE_LINE) {
			System.out.println("输出队列已满，添加失败");
		} else {
			printData[dataNum++] = msg;
		}
	}

	public static void main(String[] args) {
		Output o = new Printer();
		o.getData("轻量级");
		o.getData("Java讲义");
		o.out();
		o.getData("疯狂android");
		o.getData("Ajax");
		//调用接口中的默认方法
		o.print("孙悟空", "猪八戒", "沙僧");
		//接口里的类方法只能用类名调用，不能有接口对象调用
		Output.staticTest();
		
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		
		//接口不能显式继承任何类，但是所有接口的引用变量都可以直接复制个Object类型
		//因为编译器知道任何Java对象都必须是Object或其子类
		Object obj = p;
	}
}
