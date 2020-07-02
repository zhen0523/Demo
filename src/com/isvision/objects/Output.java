package com.isvision.objects;

//类的修饰符可以是public或者省略，如果省略则默认采用包权限访问控制符，表示同一个包下可以访问该接口
//因此一个源文件中最多只能有一个public接口和文件名相同
public interface Output {
	//接口里面的成员变量只能是常量，不管是否使用了public static final修饰符，接口里面的成员变量都使用这三个修饰符修饰
	//相当于public static final int MAX_CACHE_LINE = 50;
	int MAX_CACHE_LINE = 50;
	
	//接口里定义的定义的方法只能是普通方法、类方法和默认方法（Java8新增）
	//如果不是定义默认方法，系统将自动为普通方法添加abstract修饰符
	//接口里的普通方法只能是public abstract方法
	void out();
	void getData(String msg);
	
	//接口里定义默认方法，需要使用default修饰
	//默认方法不能用static修饰，默认是有public 修饰
	default void print(String... msgs) {
		for(String msg : msgs) {
			System.out.println(msg);
		}
	}
	
	static String staticTest() {
		return "接口里的类方法";
	}
}
