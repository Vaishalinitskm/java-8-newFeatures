package com.tutorial.practise.multithreading;

import java.util.concurrent.TimeUnit;

public class TestVolatile {
	private static boolean stopRequested;

	public static void main(String[] args) throws InterruptedException {
		Thread backgroundThread = new Thread(new Runnable() {
			public void run() {
				int i = 0;
				while (!stopRequested) {// here stopRequested never seems to become true
					i++;
				}
			}
		});
		backgroundThread.start();
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;// stopRequested is becoming true by main thread
	}
}
