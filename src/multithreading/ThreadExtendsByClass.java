package multithreading;

public class ThreadExtendsByClass {

	public static void main(String[] args) {

		Thread even = new Thread(new Even());
		Thread odd = new Thread(new Odd());

		even.setName("Even");
		odd.setName("Odd");

		even.start();
		try {
			even.yield();;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		odd.start();

	}

}

class Even extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				System.out.println(Thread.currentThread().getName() + ": " + i);
		}

	}
}

class Odd extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0)
				System.out.println(Thread.currentThread().getName() + ": " + i);
		}

	}
}