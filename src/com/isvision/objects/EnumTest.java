package com.isvision.objects;

public class EnumTest {
	
	public void judge(SeasonEnum s) {
		switch(s) {
		case SPRING:
			System.out.println("春暖花开，正好踏青");
			break;
		case SUMMER:
			System.out.println("夏日艳阳，适合游泳");
			break;
		case FALL:
			System.out.println("秋高气爽，及时进补");
			break;
		case WINTER:
			System.out.println("冬日雪飘，围炉看雪");
			break;
		}
	}

	public static void main(String[] args) {
		//values返回所有的枚举实例
		for(SeasonEnum s : SeasonEnum.values()) {
			System.out.println(s);
		}
		
		new EnumTest().judge(SeasonEnum.SPRING);
	}
}
