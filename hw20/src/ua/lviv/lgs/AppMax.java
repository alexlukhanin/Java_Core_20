package ua.lviv.lgs;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AppMax {

	public static void main(String[] args) {

		final int count = InputHowMuch.howMuch();

		ExecutorService executorService1 = Executors.newCachedThreadPool();
		executorService1.submit(new Runnable() {

			@Override
			public void run() {

				System.out.print("thread Thread(Forward): ");
				for (int i = 0; i < count; i++) {
					System.out.print(Fibanacci.fib(i + 1) + " ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

			}

		});

		/* Realization of delay between outputs */

		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
		scheduledExecutorService.schedule(new Runnable() {
			
			@Override
			public void run() {
				System.out.println();
				System.out.print("thread Runnable (Reverse): ");
				for (int i = count - 1; i >= 0; i--) {
					System.out.print(Fibanacci.fib(i + 1) + " ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				
			}
		}, (count + 1), TimeUnit.SECONDS);
		
		

	}

}
