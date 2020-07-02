package com.isvision.objects;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//基本类型赋值给Integer对象
		Integer intObj = 5;
		//基本类型赋值给Object类型变量
		Object boolObj = true;
		int i = intObj;
		//obj instanceof Clas obj 为一个对象，Class 表示一个类或者一个接口
		//当 obj 为 Class 的对象，或者是其直接或间接子类，或者是其接口的实现类，结果result 都返回 true，否则返回false
		//obj必须是引用类型，不能是基本类型
		if(boolObj instanceof Boolean) {
			boolean b = (Boolean)boolObj;
			System.out.println(b);
		}
	}

}
