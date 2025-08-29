package com.tnsif.day13;

public class ChildThread {
	private int n;
	private String msg;

	// Constructor
	public ChildThread(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}

	public void run() {
		for (int i = 1; i <= n; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.err.println("Thread interrupted: " + e.getMessage());
			}
			System.out.println(msg + i + " " + Thread.currentThread().getName());
		}
	}

	public void join(int i) {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}

