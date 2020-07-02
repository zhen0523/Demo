package com.isvision.objects;

class Out {
	class In {
		public In(String msg) {
			System.out.println(msg);
		}
	}
}

public class CreateInnerInstance {
	public static void main(String[] args) {
		//内部类完整的类名时外部类.内部类，即 Out.In
		Out.In in = new Out().new In("创建内部类对象");
		//上面代码用可分解成
		//使用OutterClas.InnerClass的形式定义内部类变量
		//OutIn in;
		//创建外部类实例，非静态内部类实例寄生在该实例中
		//Out out = new Out();
		//通过外部类实例来调用内部类的构造器创建内部类实例
		//in = out.new 
	}
}
