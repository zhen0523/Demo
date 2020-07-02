package com.isvision.generic;


class Children3 extends Father {

	@Override
	//类型擦除，指定为Object类型
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}
	
}

//不保留父类泛型，T1，T2指定具体类型
//子类自身拓展泛型，名称不同即可
public class Children extends Father<String, Integer> {

	@Override
	//子类重写父类的参数类型按照父类而定
	public void test(Integer name) {
		// TODO Auto-generated method stub
		this.age = "24";
	}

}
