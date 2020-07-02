package com.isvision.objects;

//枚举类默认继承java.lang.Enum类，因此枚举类不能再显式的继承其他父类
//枚举类默认加final修饰，所以不能继承
public enum SeasonEnum {
	//必须在第一行把所有的实例显式列举出来，否者这个枚举类永远不能产生实例
	//产生这些实例时，系统自动添加public static final修饰
	SPRING,SUMMER,FALL,WINTER;
}
