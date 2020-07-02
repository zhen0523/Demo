package com.isvision.objects;

import java.util.Arrays;



public class FinalVariableTest {
	//定义成员变量时指定默认值，合法
	final int a = 6;
	//在构造器或初始化块中分配初始值，否则报错
	final String str;  
	final int c;
	final static double d;
	
	{
		//final成员变量必须又程序员显式初始化，系统不会对final成员隐式初始化
		//System.out.println(str);
		str = "Hello";
		//如果定义变量时已经指定了默认值，则不能重新赋值
		// a = 9;
	}
	
	//final类变量（静态成员变量）在定义时或静态代码块中初始化
	static {
		d = 5.6;
	}
	
	public FinalVariableTest() {
		//final成员变量只能在定义时，初始化代码块和构造函数中初始化值
		//并且顺序依次靠后，在前面初始化了，后面就不能再初始化
		c = 5;
	}
	
	public void test(final int a) {
		//不能对final修饰的形参赋值
		//a = 5
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//在局部final变量定义时赋值，则str无法重新赋值
		final String str="hello";
		//定义final局部变量时没有指定默认值，则变量可以被赋值一次
		final double d;
		d = 5.6;
		
		//final修饰引用类型，表示指向的对象地址不能变，但是对象的内容可以改变
		final int[] iArr = {5, 2, 3, 6};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr); //final修饰数组变量，iArr是引用类型，所以对数组进行排序合法
		iArr[2] = 9; //合法
		//iArr = null; //非法 改变了指向的对象
		
		//在编译时就能确定a， b， strJava，book的值，所以这几个值相当于“宏替换”
		final int a = 5 + 2;
		final double b = 1.2 /3;
		final String strJava = "疯狂" + "Java";
		final String book = "疯狂Java讲义" + 99.0;
		final String book2 = "疯狂Java讲义" + String.valueOf(99.0);
		System.out.println(book == "疯狂Java讲义99.0"); //true 相当于System.out.println(("疯狂Java讲义" + 99.9) == "疯狂Java讲义99.0")
		System.out.println(book2 == "疯狂Java讲义99.0"); //false ==是比较的地址
	}

}
