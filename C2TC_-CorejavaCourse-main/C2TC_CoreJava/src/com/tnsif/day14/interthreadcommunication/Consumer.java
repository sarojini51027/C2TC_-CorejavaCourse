
	package com.tnsif.day14.interthreadcommunication;

	public class Consumer<Q> extends Thread {
		Q obj; 

		public Consumer(Q obj) {
			this.obj = obj;
			start();
		}

		public void run() {
				while (true) {
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					System.out.println(e);
				}
				( (Object) obj).get();
			}
		}
	}
