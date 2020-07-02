package com.isvision.objects;

public enum OperationEnum {
	PLUS {
		public double eval(double x, double y) {
			return x+y;
		}
	}, //逗号不要少
	MINUS {
		public double eval(double x, double y) {
			return x+y;
		}
	},
	TIMES {
		public double eval(double x, double y) {
			return x*y;
		}
	},
	DIVIDE {
		public double eval(double x, double y) {
			return x/y;
		}
	}; //到这里时第一条语句
	
	public abstract double eval(double x, double y);
	
	public static void main(String[] args) {
		//这个程序会生成5个class，PLUS,MINUS,TIMES,DIVIDE实际上是OperationEnum的匿名内部类
		System.out.println(OperationEnum.PLUS.eval(3,4));
		System.out.println(OperationEnum.MINUS.eval(3,4));
		System.out.println(OperationEnum.TIMES.eval(3,4));
		System.out.println(OperationEnum.DIVIDE.eval(3,4));
	}
}
