package com.isvision.multithread;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getId() + "正在运行");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.run();
	}

}
