package com.isvision.myexception;

class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int i;

	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public MyException(String message, int x) {
		super(message);
		i = x;
	}
	
	public int val() {
		return i;
	}
}

public class DemoException {
	
	public static void a() throws MyException {
		System.out.println("Throwing MyException from a()");
		throw new MyException();
	}
	
	public static void b() throws MyException {
		System.out.println("Throwing MyException from b()");
		throw new MyException("Originated in b");
	}
	
	public static void c() throws MyException {
		System.out.println("Throwing MyException from c()");
		throw new MyException("Originated in c", 47);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			a();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			b();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} 
		
		try {
			c();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //异步打印
			System.out.println("error code:" + e.val());
		}
	}

}
