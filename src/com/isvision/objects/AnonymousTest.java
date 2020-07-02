package com.isvision.objects;

interface IProduct {
	public double getPrice();
	public String getName();
}

public class AnonymousTest {
	
	public void test(IProduct p) {
		System.out.println("购买一个" + p.getName() + ", 花掉了" + p.getPrice());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousTest ta = new AnonymousTest();
		String name = "AGP 显卡";
		
		ta.test(new IProduct(){
			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 567.8;
			}

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				//Java8之前下面的语句错误，局部变量被匿名内部类访问必须用final修饰
				//Java8开始，如果匿名内部类，局部内部类访问非final局部变量，自动加final
				System.out.println(name);
				//加了final，不能被修改,同时String是个不可变类，修改String变量的内容相当于重新new
				//name = "我想修改";
				return "AGP 显卡";
			}
		});
	}

}
