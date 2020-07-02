package com.isvision.objects;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1）子类是不继承父类的static变量和方法的。因为这是属于类本身的。但是子类是可以访问的。 
		//2）子类和父类中同名的static变量和方法都是相互独立的，并不存在任何的重写的关系。
		Parent child=new Son();
        child.staticMethod();//输出：Parent staticMethod run

        Son s=new Son();
        s.staticMethod();
        child.method();//这样才存在多态        
	}

}
