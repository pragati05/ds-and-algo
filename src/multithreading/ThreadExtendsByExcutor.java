package multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadExtendsByExcutor {

	public static void main(String[] args) {

		Executor ex =  Executors.newFixedThreadPool(10);
		
		for (int i = 1; i < 100; i++) {
			
			ex.execute(new NumberExcutor(i));
		}
	
//		for (int i = 1; i < 100; i++) {
//			
//			Thread numberExcutor = new Thread(new NumberExcutor(i));
//			numberExcutor.start();
//		}

	}

}

class NumberExcutor implements Runnable {

	int number;

	NumberExcutor(int num) {
		this.number = num;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + ": " + this.number);
	}
}
