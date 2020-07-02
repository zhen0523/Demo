package com.isvision.objects;

public class Primitive2tring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String intStr = "123";
		//把字符串转换为int的两种方式
		int int1 = Integer.parseInt(intStr);
		int int2 = new Integer(intStr);
		System.out.println(int2);
		String floatStr = "4.56";
		float float1 = Float.parseFloat(floatStr);
		float float2 = new Float(floatStr);
		System.out.println(float2);
		String floatstr = String.valueOf(2.345f);
		String doublestr = String.valueOf(2.567);
		//基本类型转字符串
		String intstr = 123 + "";
		//包装类的比较不是比较值，是比较对象的地址
		System.out.println("比较2个包装类是否相等：" + (new Integer(2) == new Integer(2)));
		//注意
		Integer inta = 2;
		Integer intb = 2;
		//下同在处理-128~127之间的整数自动装箱时，会直接使用cache中的元素
		System.out.println("两个小于127的int值自动装箱后：" + (inta == intb)); //true
		Integer biga = 128;
		Integer bigb = 128; 
		System.out.println("两个大于127的int值自动装箱后：" + (biga == bigb)); //false
	
		
	}
}
