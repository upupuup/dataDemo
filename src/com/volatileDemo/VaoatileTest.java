package com.volatileDemo;

public class VaoatileTest {
	public volatile static int count = 0;
	
	public static void main(String args[]) {
		// 开启十个线程
		for (int i = 0; i < 10; i++) {
			new Thread (
					new Runnable() {
						public void run() {
							try {
								Thread.sleep(1);
							} catch (Exception e) {
								e.printStackTrace();
							}
							
							// 每个线程当中让count值自增100次
							for (int j = 0; j < 100; j++) {
								count++;
							}
						}
					}
			).start();
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("count=" + count);
	}
	
}
