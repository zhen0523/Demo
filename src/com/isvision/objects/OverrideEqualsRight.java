package com.isvision.objects;

class Person
{
	private String name;
	private String idStr;
	
	public Person() {}
	public Person(String name, String idStr) {
		this.name = name;
		this.idStr = idStr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	
	//equals正常先判断地址，再判断类型，最后比较值
	public boolean equals(Object obj) {
		//如果两个对象为同一个对象
		if(this == obj) {
			return true;
		}
		//判断obj是不是Person对象
		if(obj != null && obj.getClass() == Person.class) {//获取Class的两种方式
			Person personObj = (Person)obj;
			if(this.getIdStr().equals(personObj.getIdStr())) {
				return true;
			}
		}
		return false;
	}
}

public class OverrideEqualsRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("孙悟空", "123123");
		Person p2 = new Person("孙悟饭", "123123");
		System.out.println("p1和p2是否相等：" + p1.equals(p2));
	}

}
