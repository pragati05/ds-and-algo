package multithreading;

public class ThreadExtendsByInterface {

	public static void main(String[] args) {

		Thread even = new Thread(new Even());
		Thread odd = new Thread(new Odd());

		even.setName("Even Number");
		odd.setName("Odd Number");

		even.start();

		odd.start();

	}

}

class EvenNumber implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				System.out.println(Thread.currentThread().getName() + ": " + i);
		}

	}
}

class OddNumber implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0)
				System.out.println(Thread.currentThread().getName() + ": " + i);
		}

	}
}