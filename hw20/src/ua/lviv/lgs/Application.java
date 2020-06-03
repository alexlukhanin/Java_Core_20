/**
 * 
 */
package ua.lviv.lgs;



/**
 * @author alexl
 *
 */
public class Application {

	public static void main(String[] args) {
		int count = 0;
		count = InputHowMuch.howMuch();
		
		System.out.print("thread Thread: ");
		
		MyThread myThread = new MyThread(count);
		myThread.start();
		
		/* Realization of delay between outputs  */
		try {
			Thread.sleep(1000 * count + 1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println();
		System.out.print("thread Runnable: ");
		
		Thread thread = new Thread(new RunnableThread(count));
		thread.start();
	}

}

class MyThread extends Thread {
	private int count;

	public MyThread(int count) {
		super();
		this.count = count;
	}

	@Override
	public void run() {

		for (int i = 0; i < count; i++) {
			System.out.print(Fibanacci.fib(i + 1) + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}

class RunnableThread implements Runnable {
	private int count;

	public RunnableThread(int count) {
		super();
		this.count = count;
	}
	
	
	@Override
	public void run() {
		for (int i = count-1; i >=0; i--) {
			System.out.print(Fibanacci.fib(i + 1) + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}